package com.learnspring.demo.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author tamvo
 * @created 13/02/2020 - 3:28 PM
 */

@Service
public class JwtUserDetailsService implements UserDetailsService {

    private static final String USER_NAME = "tamvo";
    private static final String PASSWORD = "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6";

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        if (USER_NAME.equals(s)){
            return new User(USER_NAME, PASSWORD, new ArrayList<>());
        }

        throw new UsernameNotFoundException(s);
    }
}
