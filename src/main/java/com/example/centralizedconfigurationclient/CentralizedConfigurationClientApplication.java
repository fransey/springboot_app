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
    
@Value("<!DOCTYPE html><html><head><title>Spring Boot Application</title><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\"><script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script><script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script></head>       <body><div class="jumbotron text-center" style="background-color:#${color: E6E6FA}\">	<h1> This is a Spring boot Application </h1>	<p>Name: </p> ${spring.application.name} <br>	<p>Version: </p> ${spring.application.version} <br>	<p>Profile: </p> ${spring.profiles.active} <br>	<p>Message: </p> ${message: default message} </div></body></html><!DOCTYPEhtml><html><head><title>SpringBootApplication</title><metacharset="utf-8"><metaname="viewport"content="width=device-width,initial-scale=1"><linkrel="stylesheet"href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"><scriptsrc="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script><scriptsrc="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script></head><body><divclass="jumbotrontext-center"style="background-color:#${color:E6E6FA}\"><h1>ThisisaSpringbootApplication</h1><p>Name:</p>${spring.application.name}<br><p>Version:</p>${spring.application.version}<br><p>Profile:</p>${spring.profiles.active}<br><p>Message:</p>${message:defaultmessage}</div></body></html>")
 
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
