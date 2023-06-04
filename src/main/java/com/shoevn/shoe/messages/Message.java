package com.shoevn.shoe.messages;

import lombok.Data;

@Data
public class Message {

    private String senderName;
    private String targetUserName;
    private String message;



}