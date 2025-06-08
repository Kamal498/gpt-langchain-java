package com.mcp.server.gpt_langchain_java.controller;

import com.mcp.server.gpt_langchain_java.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public ResponseEntity<String> chat(@RequestBody String userPrompt) {
        String response = chatService.analyzeOrders(userPrompt);
        return ResponseEntity.ok(response);
    }
}
