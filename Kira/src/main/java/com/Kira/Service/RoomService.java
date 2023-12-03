package com.Kira.Service;

import com.Kira.Entity.Model.Room;
import com.Kira.Entity.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
        Optional<Room> roomEntityOptional = roomRepository.findById(id);
        if (roomEntityOptional.isEmpty()) {
            return "failed";
        }
        Room roomEntity = roomEntityOptional.get();
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
