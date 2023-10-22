package com.Kira.Service;

import com.Kira.Entity.Model.Room;
import com.Kira.Entity.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;

    public Optional<Room> getRoomById(String id) {
        return roomRepository.findById(id);
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public String createRoom(Room room) {
        Room roomEntity = new Room();
        roomEntity.setId(room.getId());
        roomEntity.setTotalNumber(room.getTotalNumber());
        roomEntity.setCurrentNumber(room.getCurrentNumber());
        roomEntity.setHasPassword(room.getHasPassword());
        roomEntity.setPassword(room.getPassword());
        roomEntity.setStatus(room.getStatus());
        roomEntity.setGameId(room.getGameId());
        roomRepository.save(roomEntity);
        return "success";
    }

    public void deleteRoomById(String id) {
        roomRepository.deleteById(id);
    }

    public String updateRoomById(String id, Room room) {
        Optional<Room> roomEntity = roomRepository.findById(id);
        if (roomEntity.isEmpty()) {
            return "failed";
        }
        roomEntity.setTotalNumber(room.getTotalNumber());
        roomEntity.setCurrentNumber(room.getCurrentNumber());
        roomEntity.setHasPassword(room.getHasPassword());
        roomEntity.setPassword(room.getPassword());
        roomEntity.setStatus(room.getStatus());
        roomEntity.setGameId(room.getGameId());
        roomRepository.save(roomEntity);
        return "success";
    }
}
