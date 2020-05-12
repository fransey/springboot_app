package com.example.centralizedconfigurationclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.info.BuildProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CentralizedConfigurationClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CentralizedConfigurationClientApplication.class, args);
    }

}

@RefreshScope
@RestController
class MessageRestController {
    @Value("<!DOCTYPE html> <html> <head><meta http-equiv=\"refresh\" content=\"20\" ></head> <body bgcolor=#\"${color: E6E6FA}\"> <h1> This is a Spring boot Application </h1> <b>Name: </b> ${spring.application.name} <br><b>Version: </b> ${spring.application.version} <br><b>Profile: </b> ${spring.profiles.active} <br><b>Message: </b> ${message: default message} </body> </html>")
    private String message;
    private String color;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }

    String getColor() {
        return this.color;
    }
}
