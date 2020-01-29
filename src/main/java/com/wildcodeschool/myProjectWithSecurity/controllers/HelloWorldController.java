/**
 * Created by AEr on 29.01.20.
 */


package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String everyone() {
        return "Welcome to the SHIELD";

    }

    @GetMapping("/avengers/assemble")
    public String heroes() {
        return "Avengers..... Assemble";
    }

    @GetMapping("/secret-bases")
    public String director() {
        return "Darmstadt, Bonn, Berlin, usw.!!!";
    }
}
