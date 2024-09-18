package org.example.Users;

public class Users {
    private final String name;
    private final String userId;
    private final String password;


    //Metodo Constructor
    public Users(String name, String userId, String password) {
        this.name = name;
        this.userId = userId;
        this.password = password;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getUserId() {
        return userId;
    }
    public String getPassword() {
        return password;
    }

}
