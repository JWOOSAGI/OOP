package service;

import builder.UserBuilder;
import model.UserDTO;

import java.util.List;
import java.util.Map;

public interface UserService {

    String addUsers();
    String countUsers();
    String join(UserDTO build);
    Map<String, UserDTO> getUserMap();
    String login(UserDTO build);
    String findUserByID(UserDTO build);
    String findUserByJob(UserDTO build);
}
