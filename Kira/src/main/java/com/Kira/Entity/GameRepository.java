package com.Kira.Entity;

import com.Kira.Entity.Model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<Game, String> {
    public Optional<Game> findById(Integer id);
}
