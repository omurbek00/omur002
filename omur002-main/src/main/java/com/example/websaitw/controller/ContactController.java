package com.example.websaitw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {
    @Autowired
    private JavaMailSender mailSender;
    @GetMapping("/contact")
    public String showContactForm() {
        return "contact";
    }
    @PostMapping("/contact")
    public String submitContact(HttpServletRequest request){
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        SimpleMailMessage massage = new SimpleMailMessage();
        massage.setFrom("avlbekovomurbek@gmail.com");
        massage.setTo("omurbek.avalbekov@iaau.edu.kg");
        String mailSubject = name +" hash sent a massage";
        String mailContent = "Sender Name: " + name + "\n";
        mailContent += "Sender E-mail: " + email + "\n";
        mailSubject += "Phone: " + phone + "\n";
        mailSender.send(massage);
        return "message";
    }
}
