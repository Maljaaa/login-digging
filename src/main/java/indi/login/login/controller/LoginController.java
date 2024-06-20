package indi.login.login.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class LoginController {

    @GetMapping("/signup")
    public String signup() {

        return "signup";
    }

    @GetMapping("/login")
    public String login() {

        return "login";
    }
}
