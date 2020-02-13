package com.learnspring.demo.model;

/**
 * @author tamvo
 * @created 13/02/2020 - 3:42 PM
 */
public class JwtResponse {

    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getJwttoken() {
        return jwttoken;
    }
}
