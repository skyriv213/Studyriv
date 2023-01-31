package com.example.websocket;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter

public class MsgRoom {

    private String roomId;
    private Set<WebSocketSession> sessions = new HashSet<>();

    @Builder
    public MsgRoom(String roomId) {
        this.roomId = roomId;
    }

    public void handActions(WebSocketSession session, Message message, MsgService msgService) {
        if (message.getMessageType().equals(Message.MessageType.ENTER)) {
            sessions.add(session);
            message.setMessage(message.getSender()+"님이 입장함");
        }
        sendMessage(message, msgService);
    }

    public <T> void sendMessage(Message message, MsgService msgService) {
        sessions.parallelStream().forEach(session -> msgService.sendMessage(session, message));
    }
}
