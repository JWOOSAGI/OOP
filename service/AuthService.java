package service;

import model.UserDTO;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {
     String addUsers();
     String join(UserDTO user);
     String login(UserDTO user);
     UserDTO findUserById(String username);
     String updatePassword(UserDTO user);
     String deleteUser(String username);
     Map<String, UserDTO> getUserMap();
     List<UserDTO> findUsersByName(String name);
     List<UserDTO> findUsersByJob(String job);
     String countUsers();


}