package com.Kira.Entity;

import com.Kira.Entity.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room, String> {
    public List<Room> findAll();

    public Optional<Room> findById(String id);

    public void deleteById(String id);
}
