package com.adprojects.email_sender;

import com.adprojects.email_sender.dtos.Message;
import com.adprojects.email_sender.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
public class EmailSenderTest {

    @Autowired
    private EmailService emailService;

    @Test
    void emailSendTest(){
        String[] to={"ameyadeshmukh742@gmail.com", "amegr99@gmail.com"};
        emailService.sendEmail(to,"Email from Spring Boot to all", "Email has been sent via Spring Boot Service using EmailService to all");
        System.out.println("sending email");
    }

    @Test
    void sendHTMLInEmail(){
        String html = ""+
                "<h1 style='color:red;border:1px solid red;'>Spring Boot Email</h1>" +
                "";
        emailService.sendEmailWithHtml("ameyadeshmukh742@gmail.com","Email from Spring Boot with HTML", html);
    }

    @Test
    void sendEmailWithFile() {
        emailService.sendEmailWithFile("ameyadeshmukh742@gmail.com",
                "Email with File",
                "PFA file in this mail" ,
                new File("C:\\Users\\Admin\\Desktop\\BackendProject\\email-sender\\src\\main\\resources\\email-attachment.jpg"));
    }

    @Test
    void sendEmailWithStream() {

        File file= new File("C:\\Users\\Admin\\Desktop\\BackendProject\\email-sender\\src\\main\\resources\\email-attachment.jpg");
        try {
            InputStream is = new FileInputStream(file);
            emailService.sendEmailWithStream("ameyadeshmukh742@gmail.com",
                    "Email with File Stream",
                    "PFA file in this mail attachment from stream" ,
                    is);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void getInbox(){
        List<Message> inboxMessages = emailService.getInboxMessages();
        inboxMessages.forEach(item->{
            System.out.println(item.getSubjects());
            System.out.println(item.getContent());
            System.out.println(item.getFiles());
        });

    }
}
