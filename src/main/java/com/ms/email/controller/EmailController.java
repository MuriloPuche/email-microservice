package com.ms.email.controller;


import com.ms.email.services.EmailServices;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController  {

    private final EmailServices emailServices;

    public EmailController(EmailServices emailServices) {
        this.emailServices = emailServices;
    }


}
