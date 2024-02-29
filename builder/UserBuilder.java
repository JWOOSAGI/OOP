package builder;

import model.UserDTO;

public class UserBuilder {
    private String username;
    private String passwordConfirm;
    private String password;
    private String name;

    private String ssn;
    private String phoneNumber;
    private String address;
    private String job;

    private double height;
    private double weight;

    public UserBuilder username(String username){
        this.username = username;
        return this;
    }
    public UserBuilder password(String password){
        this.password = password;
        return this;
    }
    public UserBuilder passwordConfirm(String passwordConfirm){
        this.passwordConfirm = passwordConfirm;
        return this;
    }
    public UserBuilder name(String name){
        this.name = name;
        return this;
    }
    public UserBuilder ssn(String ssn){
        this.ssn = ssn;
        return this;
    }
    public UserBuilder phoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }
    public UserBuilder address(String address){
        this.address = address;
        return this;
    }
    public UserBuilder job(String job){
        this.job = job;
        return this;
    }
    public UserBuilder height(double height){
        this.height = height;
        return this;
    }
    public UserBuilder weight(double weight){
        this.weight = weight;
        return this;
    }

    public UserDTO build(){
        return new UserDTO(username, passwordConfirm, password, name, ssn,
                phoneNumber, address, job,height, weight);
    }

}
