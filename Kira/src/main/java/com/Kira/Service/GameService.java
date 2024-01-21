package com.Kira.Service;

import com.Kira.Entity.GameRepository;
import com.Kira.Entity.Model.Game;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;

    public Optional<Game> getGameById(String id) {
        return gameRepository.findById(id);
    }
}
