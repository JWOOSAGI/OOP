package serviceImpl;

import builder.UserBuilder;
import model.UserDTO;
import repository.UserRepository;
import service.AuthService;
import service.UserService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    Map<String, UserDTO> users;

    public UserServiceImpl() {
        this.userRepository = new UserRepository();
        this.users = new HashMap<>();
    }

    @Override
    public String addUsers() {
        Map<String, UserDTO> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUserName();
            map.put(username,
                    new UserBuilder()
                            .username(username)
                            .password("1")
                            .passwordConfirm("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return users.size() + " 개 더미값 추가";
    }

    @Override
    public String countUsers() {
        return users.size() + "";
    }

    @Override
    public String join(UserDTO user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";
    }

    @Override
    public Map<String, UserDTO> getUserMap() {
        return users;
    }

    @Override
    public String login(UserDTO user) {
        String msg = "";
        UserDTO userInMap = users.get(user.getUsername());
        if (userInMap == null) {
            msg = "아이디 틀림";
        } else {
            if (userInMap.getPassword().equals(user.getPassword())) {
                msg = "로그인 성공";
            } else {
                msg = "비밀번호 틀림";
            }
        }
        return msg;
    }

    @Override
    public String findUserByID(UserDTO user) {
        String msg = "";
        UserDTO userIdInMap = users.get(user.getUsername());
        if (userIdInMap == null) {
            msg = "ID가 존재하지 않습니다.";
        } else {
                msg = "ID가 존재합니다. 내 정보를 확인합니다.\n" +
                        userIdInMap.toString();
        }
        return msg;
    }

    @Override
    public String findUserByJob(UserDTO build) {}
}
