package com.Kira.Entity;

import com.Kira.Entity.Model.Round;
import com.Kira.Entity.Model.Round.RoundTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoundRepository extends JpaRepository<Round, String> {
    public Round findByGameId(Integer id);
}