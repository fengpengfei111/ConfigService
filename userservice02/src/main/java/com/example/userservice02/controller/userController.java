package com.example.userservice02.controller;




import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/user")
public class userController {

    @Value("${user.username}")
    private String username;
    @Value("${user.password}")
    private String password;

    @RequestMapping("/getMessage")
    public String getMessage(@RequestHeader HttpHeaders headers) {
        return "02";
//        System.out.println(headers.getFirst("from"));
//        System.out.println(redisUtil.get("fromGateway"));
//        return username + "  " + password;
    }
}
