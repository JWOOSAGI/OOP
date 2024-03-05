package service;

import model.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    String addUsers();
    String join(User user);
    String login(User user);
    User findUserById(String username);
    String updatePassword(User user);
    String deleteUser(String username);
    List<?> getUserList();
    List<?> findUsersByName(String name);
    List<?> findUsersByJob(String job);
    String countUsers();

    Map<String, ?> getUserMap();
}
