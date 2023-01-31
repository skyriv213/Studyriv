package com.example.websocket;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chat")
public class MsgController {

    private final MsgService msgService;

    @PostMapping
    public MsgRoom createRoom(@RequestParam String name) {
        //TODO: name is Summoner Name
        return msgService.createRoom(name);
    }

    @GetMapping
    public List<MsgRoom> findAllRoom() {
        return msgService.findAllRoom();
    }
}
