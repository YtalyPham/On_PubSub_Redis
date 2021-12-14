package com.example.onck_pubsub_lan2.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Message {
    private String data;
    private String author;


}
