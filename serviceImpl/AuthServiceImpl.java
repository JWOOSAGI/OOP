package serviceImpl;

import builder.UserBuilder;
import model.UserDTO;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, UserDTO> users;
    private AuthServiceImpl(){
        this.users = new HashMap<>();
    }
    public static AuthService getInstance(){return instance;}
    public String join(Scanner sc) {
        System.out.println("ID, 비밀번호, 비밀번호 확인, " +
                "이름, 주민번호 전화번호, " +
                "주소, 직업을 입력해주세요");

        UserDTO person = new UserBuilder()
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
    public String join(UserDTO user) {
        users.put(user.getUsername(),user);
                return "회원가입 성공";
    }
    @Override
    public String login(UserDTO user) {
        return null;
    }
    @Override
    public UserDTO findUserById(String username) {
        return null;
    }

    @Override
    public String updatePassword(UserDTO user) {
        return null;
    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    public Map<String, UserDTO> getUserMap() {
        users.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
        return users;
    }

    @Override
    public List<UserDTO> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<UserDTO> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUsers() {
        return users.size()+"";
    }
    @Override
    public String addUsers() {
        Map<String, UserDTO> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0; i<5; i++){
            String userName = util.createRandomName();
            map.put(userName,
                    new UserBuilder()
                            .name(userName)
                            .password("1")
                            .passwordConfirm("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return "더미값 추가";
    }
    public UserDTO findUser(String userName) {
        UserDTO user = new UserBuilder()
                            .build();
        return user;
    }
}