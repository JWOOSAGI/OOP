package controller;

import model.User;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController {
    UserService userService;

    public UserController() {
        this.userService = UserServiceImpl.getInstance();
    }

    public String addUsers() {
        return userService.addUsers();
    }
    public String join(Scanner sc) {
        System.out.println("ID, " +
                "비밀번호, " +
                "비밀번호 확인, " +
                "이름, " +
                "주소, " +
                "직업을 입력해주세요");
        return userService.join(User.builder()
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
        return userService.login(User.builder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public User findUserById(Scanner sc) {
        System.out.println("검색할 ID 입력 : ");

        return userService.findUserById(sc.next());
    }

    public String updatePassword(Scanner sc) {
        System.out.println("수정할 ID 입력 : ");
        System.out.println("수정할 비번 입력 : ");
        return userService.updatePassword(User.builder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String  deleteUser(Scanner sc) {
        System.out.println("삭제할 ID 입력 : ");
        return userService.deleteUser(sc.next());
    }

    public Map<String, ?> getUserMap() {
        System.out.println("전체 목록 출력");
        return userService.getUserMap();
    }

    public List<?> findUsersByName(Scanner sc) {
        System.out.println("이름으로 검색");
        return userService.findUsersByName(sc.next());
    }

    public List<?> findUsersByJob(Scanner sc) {
        System.out.println("직업으로 검색");
        return userService.findUsersByJob(sc.next());
    }

    public String countUsers() {
        System.out.println("회원수");
        return userService.countUsers();
    }


}
