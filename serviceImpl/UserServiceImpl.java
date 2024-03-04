package serviceImpl;

import model.User;
import service.UserService;
import service.UtilService;

import java.util.*;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();
    Map<String, User> users;
    List<?> listusers;

    private UserServiceImpl() {
        this.users = new HashMap<>();
        this.listusers = new ArrayList<>();

    }
    public static UserService getInstance(){return instance;}
    @Override
    public String addUsers() {
        Map<String, User> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0; i<5; i++){
            String username = util.createRandomUserName();
            map.put(username,
                    User.builder()
                            .username(username)
                            .password("1")
                            .passwordConfirm("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return users.size()+"개 더미값 추가";

    }


    @Override
    public String join(User user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";
    }

    @Override
    public String login(User user) {
        return users.getOrDefault(user.getUsername(), User.builder().password("").build())
                .getPassword()
                .equals(user.getPassword()) ?
                "로그인 성공" : "로그인 실패";
    }

    @Override
    public User findUserById(String username) {
        return users.get(username);
    }

    @Override
    public String updatePassword(User user) {
        users.get(user.getUsername()).setPassword(user.getPassword());

        return "비번 변경 성공";
    }

    @Override
    public String deleteUser(String username) {
        users.remove(username);
        return "회원삭제";
    }

    @Override
    public List<User> getUserList() {
        return  new ArrayList<>(users.values());
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
    public Map<String, User> getUserMap() {
        return users;
    }
}
