package controller;

import builder.UserBuilder;
import model.UserDTO;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class UserController {
    UserService userService;

    public UserController() {
        this.userService = new UserServiceImpl();
    }

    public String addUsers() {
        String msg = userService.addUsers();
        return msg;
    }

    public String countUsers() {
        String numberOfUsers = userService.countUsers();
        return numberOfUsers;
    }

    public String join(Scanner sc) {
        System.out.println("ID, " +
                "비밀번호, " +
                "이름, " +
                "전화번호, " +
                "주소, " +
                "직업을 입력해주세요");
        return userService.join(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .name(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build());
    }

    public Map<String, UserDTO> getUserMap() {
        System.out.println("전체 목록 출력");
        return userService.getUserMap();
    }

    public String login(Scanner sc) {
        System.out.println("로그인 할 ID와 PW를 입력하세요.");
        return userService.login(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String findUserByID(Scanner sc) {
        System.out.println("ID를 입력후 내 정보를 확인하세요.");
        return userService.findUserByID(new UserBuilder()
                .username(sc.next())
                .build());
    }

    public String findUserByJob(Scanner sc) {
        System.out.println("직업을 입력후 내 정보를 확인하세요.");
        return userService.findUserByJob(new UserBuilder()
                .job(sc.next())
                .build());
    }
}
