package com.ms.email.services;

import com.ms.email.repositories.EmailRepository;
import org.springframework.stereotype.Service;

@Service
public class EmailServices {

    private final EmailRepository emailRepository;

    public EmailServices(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }



}
