package com.Kira.Entity;

import com.Kira.Entity.Model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, String> {
    public Optional<Game> findById(String id);
}
