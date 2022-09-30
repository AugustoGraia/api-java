package com.api.parkingcontrol.controller;

import com.api.parkingcontrol.services.EmailService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }
}
