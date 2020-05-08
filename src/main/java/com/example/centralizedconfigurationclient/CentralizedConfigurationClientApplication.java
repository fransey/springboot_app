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
    @Value("<!DOCTYPE html> <html> <head><meta http-equiv=\"refresh\" content=\"5\" ></head> <body bgcolor=#\"${color: E6E6FA}\"> <h1> Spring Cloud App - My App</h1> <b>Name: </b> ${spring.application.name} <br><b>Version: </b> ${spring.application.version} <br><b>Profile: </b> ${spring.profiles.active} <br><b>Message: </b> ${message: default message} </body> </html>")
    private String message;
    private String color;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }

    String getColor() {
        return this.color;
    }
    
    public void testMethod()
    {
        String test01 = "test01";
        String test02 = "test02";
        String test03 = "test03";
        String test04 = "test04";
        String test05 = "test05";
        String test06 = "test06";
        String test07 = "test07";
        String test08 = "test08";
        String test09 = "test09";
        String test10 = "test10";
        String test11 = "test11";
        String test12 = "test12";
        String test13 = "test13";
        String test14 = "test14";
        String test15 = "test15";
        String test16 = "test16";
    }
}