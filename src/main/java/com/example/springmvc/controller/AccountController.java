package com.example.springmvc.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@Controller
public class AccountController {

    @GetMapping("/user")
    public String showUserInfo() {
        return "UserInfo";
    }
}


