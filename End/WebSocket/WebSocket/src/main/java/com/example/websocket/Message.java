package com.example.websocket;

import lombok.*;

@Getter
@Setter
public class Message {

    // {"type":"","sender":"me","receiver":"asdad","data":"test.."}
    public enum MessageType{
        ENTER, COMM
    }

    private MessageType messageType;
    private String roomId;
    private String sender;
    private String message;

}
