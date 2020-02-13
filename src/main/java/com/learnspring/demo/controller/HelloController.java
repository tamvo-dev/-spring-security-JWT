package com.learnspring.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author tamvo
 * @created 13/02/2020 - 2:55 PM
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> getContent(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
