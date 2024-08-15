package com.adprojects.email_sender.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {

    private String From;
    private String content;
    private List<String> files;
    private String from;
    private String subjects;

}
