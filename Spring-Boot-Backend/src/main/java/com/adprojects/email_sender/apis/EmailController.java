package com.adprojects.email_sender.apis;

import com.adprojects.email_sender.dtos.CustomResponse;
import com.adprojects.email_sender.dtos.EmailRequest;
import com.adprojects.email_sender.dtos.Message;
import com.adprojects.email_sender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request){

        emailService.sendEmailWithHtml(request.getTo(), request.getSubject(), request.getMessage());
        return ResponseEntity.ok(
                CustomResponse.builder().
                        message("Email Sent Successfully !!").
                        httpStatus(HttpStatus.OK).success(true).build() );
    }

    @PostMapping("/send-with-file")
    public ResponseEntity<CustomResponse> sendWithFile(@RequestPart EmailRequest request, @RequestPart MultipartFile file) throws IOException {

        emailService.sendEmailWithStream(request.getTo(), request.getSubject(), request.getMessage(), file.getInputStream());
        return ResponseEntity.ok(
                CustomResponse.builder().
                        message("Email Sent Successfully !!").
                        httpStatus(HttpStatus.OK).success(true).build() );
    }

    @GetMapping("/get-sent-emails")
    public List<Message> getAllSentEmails(){
        return emailService.getInboxMessages();
    }
}
