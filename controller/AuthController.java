package controller;

import builder.UserBuilder;
import model.UserDTO;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthController/*implements AuthService 이 코드는 생략*/{

    //AuthService auth = AuthServiceImpl.getInstance();
    //사용하지 않아도 메모리를 차지하게 되어버리는 코드.
    //그래서 16~20번 코드로 짜야한다.

    AuthService authService;

    public AuthController() {
        this.authService /*객체*/ = AuthServiceImpl.getInstance();
    }

    public String addUsers() {
        authService.addUsers();
        return "";
    }


    public String join(Scanner sc) {
        System.out.println("ID, " +
                "비밀번호, " +
                "비밀번호 확인, " +
                "이름, " +
                "주민번호 " +
                "전화번호, " +
                "주소, " +
                "직업을 입력해주세요");
        return authService.join(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .passwordConfirm(sc.next())
                .name(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build());
    }


    public String login(Scanner sc) {
        System.out.println("로그인할 ID 입력 : ");
        return authService.login(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }


    public UserDTO findUserById(Scanner sc) {
        System.out.println("검색할 ID 입력 : ");
        return authService.findUserById(sc.next());
    }


    public String updatePassword(Scanner sc) {
        System.out.println("수정할 ID 입력 : ");
        System.out.println("수정할 비번 입력 : ");
        return authService.updatePassword(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }


    public String deleteUser(Scanner sc) {
        System.out.println("삭제할 ID 입력 : ");
        return authService.deleteUser(sc.next());
    }


    public Map<String, UserDTO> getUserMap() {
        System.out.println("전체 목록 출력");
        return authService.getUserMap();
    }


    public List<UserDTO> findUsersByName(Scanner sc) {
        System.out.println("이름으로 검색");
        return authService.findUsersByName(sc.next());
    }


    public List<UserDTO> findUsersByJob(Scanner sc) {
        System.out.println("직업으로 검색");
        return authService.findUsersByJob(sc.next());
    }


    public String countUsers() {
        System.out.println("회원수");
        return authService.countUsers();
    }
}
