package com.Kira.Controller;

import com.Kira.Entity.Model.Chat;
import com.Kira.Service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameChatController {
    @Autowired
    private ChatService chatService;

    @GetMapping("/chat/all")
    public List<Chat> getAllChat(Chat.ChatType chatType) {
        return chatService.getAllChatByChatType(chatType);
    }
}
