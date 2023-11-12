package com.Kira.Controller;

import com.Kira.Entity.Model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatController extends JpaRepository<Chat, String> {
}
