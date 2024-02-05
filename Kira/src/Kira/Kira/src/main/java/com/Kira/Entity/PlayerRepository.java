package com.Kira.Entity;

import com.Kira.Entity.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, String> {
}
