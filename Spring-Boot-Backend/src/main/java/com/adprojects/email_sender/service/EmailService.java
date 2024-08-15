package com.adprojects.email_sender.service;

import com.adprojects.email_sender.dtos.Message;

import java.io.File;
import java.io.InputStream;
import java.util.List;

public interface EmailService {

    // send mail to one person
    void sendEmail(String to, String subject, String message);

    //send mail to many people
    void sendEmail(String []to, String subject, String message);

    //send email with html
    void sendEmailWithHtml( String to, String subject, String htmlContent);

    //send email with file
    void sendEmailWithFile(String to, String subject, String message, File file);

    void sendEmailWithStream(String to, String subject, String message, InputStream is);

    List<Message> getInboxMessages();
}
