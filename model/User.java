package model;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class User {
    private int id;
    private String username;
    private String password;

    private String passwordConfirm;
    private String name;

    private String ssn;
    private String phoneNumber;
    private String address;
    private String job;

    private double height;
    private double weight;

    @Builder(builderMethodName = "builder")
    public User(String username, String password, String passwordConfirm, String name, String ssn, String phoneNumber, String address,
                String job, double height, double weight){
        this.username = username;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.name = name;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }
}
