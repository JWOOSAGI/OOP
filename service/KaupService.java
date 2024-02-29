package service;

import model.UserDTO;

public interface KaupService {
     String createBMI(UserDTO user);
     String createBodyMass(String bmi);
}
