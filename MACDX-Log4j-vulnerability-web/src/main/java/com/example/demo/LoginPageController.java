package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class LoginPageController {
    private static final Logger  logger = LogManager.getLogger(DirectController.class);

    @RequestMapping("/LoginPage")
    public String loginpage(@RequestParam(value = "title", required = false, defaultValue = "xiao") String title, Model model) {
        model.addAttribute("name", title);
        return "loginpage";
    }

    @PostMapping("/Authorize")
    public String test(@RequestParam(value = "username") String username,
                       @RequestParam(value = "password") String password,
                       Model model) {
        String correctUsername = new String("admin");
        String correctPassword = new String("1120530218@ccit.ndu.edu.tw");
        if (!correctUsername.equals(username) || !correctPassword.equals(password)) {
            logger.error("login error : username:{}, password:{}" , username ,password);
            return "unauthorized";
        }

        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return "authorized";
    }
}
