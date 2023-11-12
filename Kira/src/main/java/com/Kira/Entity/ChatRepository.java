package com.Kira.Entity;

import com.Kira.Entity.Model.Chat;
import com.Kira.Entity.Model.Chat.ChatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Chat.ChatType> {
    public List<Chat> findByChatType(ChatType chatType);
}
