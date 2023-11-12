package com.Kira.Controller;

import com.Kira.Entity.Model.Chat;
import com.Kira.Entity.Model.Round;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoundController extends JpaRepository<Round, String> {
}

