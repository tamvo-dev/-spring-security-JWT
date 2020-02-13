package com.learnspring.demo.model;

/**
 * @author tamvo
 * @created 13/02/2020 - 3:42 PM
 */
public class JwtRequest {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
