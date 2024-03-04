package serviceImpl;


import model.User;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, User> users;
    private AuthServiceImpl(){
        this.users = new HashMap<>();
    }
    public static AuthService getInstance(){return instance;}
    public String join(Scanner sc) {
        System.out.println("ID, 비밀번호, 비밀번호 확인, " +
                "이름, 주민번호 전화번호, " +
                "주소, 직업을 입력해주세요");

        User person = User.builder()
                .name(sc.next())
                .password(sc.next())
                .passwordConfirm(sc.next())
                .name(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build()
                ;
        return null;
    }
    @Override
    public String join(User user) {
        users.put(user.getUsername(),user);
                return "회원가입 성공";
    }
    @Override
    public String login(User user) {
        return null;
    }
    @Override
    public User findUserById(String username) {
        return null;
    }

    @Override
    public String updatePassword(User user) {
        return null;
    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    public Map<String, User> getUserMap() {
        users.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
        return users;
    }

    @Override
    public List<User> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<User> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUsers() {
        return users.size()+"";
    }
    @Override
    public String addUsers() {
        Map<String, User> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0; i<5; i++){
            String userName = util.createRandomName();
            map.put(userName,
                    User.builder()
                            .name(userName)
                            .password("1")
                            .passwordConfirm("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return "더미값 추가";
    }
    public User findUser(String userName) {
        User user = User.builder()
                            .build();
        return user;
    }
}