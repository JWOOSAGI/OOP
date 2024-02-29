package view;

import controller.AuthController;
import controller.UserController;
import model.UserDTO;
import service.AuthService;

import java.util.Map;
import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc) {
        UserController userController = new UserController();
        String msg = userController.addUsers();
        System.out.println("userController.addUsers();의 결과 : "+msg);
        while(true){
            System.out.println("[관리자메뉴]\n" +
                    "0-종료\n" +
                    "1-회원가입\n" +
                    "2-로그인\n" +
                    "3-ID검색\n" +
                    "4-비번변경\n" +
                    "5-탈퇴\n" +
                    "6-회원목록\n" +
                    "7-이름검색\n" +
                    "8-직업검색\n" +
                    "9-회원수");
            switch (sc.next()){
                case "0":
                    System.out.println("종료");return;
                case "1":
                    System.out.println("1-회원가입");
                    msg = userController.join(sc);
                    System.out.println("회원가입 결과 : "+msg);
                    break;
                case "2":
                    System.out.println("2-로그인");
                    msg = userController.login(sc);
                    System.out.println("로그인 결과 : "+msg);
                    break;
                case "3":
                    System.out.println("3-ID검색");
                    msg = userController.findUserByID(sc);
                    System.out.println("아이디 검색 결과 : "+msg);
                    break;
                case "4":
                    System.out.println("4-비번변경");
                    break;
                case "5":
                    System.out.println("5-탈퇴");
                    break;
                case "6":
                    System.out.println("6-회원목록");
                    Map<String, UserDTO> users = userController.getUserMap();
                    users.forEach((k,v)->{
                        System.out.printf("아이디: %s, 회원정보: %s", k, v);
                    });
                    break;
                case "7":
                    System.out.println("7-이름검색");
                    break;
                case "8":
                    System.out.println("8-직업검색");
                    msg = userController.findUserByJob(sc);
                    System.out.println("직업 검색 결과 : "+msg);
                    break;
                case "9":
                    System.out.println("9-회원수");
                    String numberOfUsers = userController.countUsers();
                    System.out.println("회원수 : "+numberOfUsers);
                    break;
            }
        }

    }
}
