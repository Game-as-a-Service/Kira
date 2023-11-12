package com.Kira.Service;

import com.Kira.Entity.ChatRepository;
import com.Kira.Entity.Model.Chat;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatRepository chatRepository;

    public List<Chat> getAllChatByChatType(Chat.ChatType chatType) {
        return chatRepository.findByChatType(chatType);
    };
}
