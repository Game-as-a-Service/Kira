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

    public String updateRoomPassword(String id, String password) {
        Optional<Room> roomEntityOptional = roomRepository.findById(id);
        if (roomEntityOptional.isEmpty()) {
            return "failed";
        }
        Room roomEntity = roomEntityOptional.get();
        roomEntity.setPassword(password);
        roomRepository.save(roomEntity);
        return "success";
    }

    public String updateRoomStatus(String id, String status) {
        Optional<Room> roomEntityOptional = roomRepository.findById(id);
        if (roomEntityOptional.isEmpty()) {
            return "failed";
        }
        Room roomEntity = roomEntityOptional.get();
        roomEntity.setStatus(Room.statusType.valueOf(status));
        roomRepository.save(roomEntity);
        return "success";
    }

    public String enterRoom(String id , String password) {
        Optional<Room> roomEntityOptional = roomRepository.findById(id);
        if (roomEntityOptional.isEmpty()) {
            return "failed";
        }
        Room roomEntity = roomEntityOptional.get();
        if (roomEntity.getHasPassword() && !roomEntity.getPassword().equals(password)) {
            return "failed";
        }
        if (roomEntity.getStatus() != Room.statusType.WAITING) {
            return "failed";
        }
        roomEntity.setCurrentNumber(roomEntity.getCurrentNumber() + 1);
        roomRepository.save(roomEntity);
        return "success";
    }

    public String leaveRoom(String id) {
        Optional<Room> roomEntityOptional = roomRepository.findById(id);
        if (roomEntityOptional.isEmpty()) {
            return "failed";
        }
        Room roomEntity = roomEntityOptional.get();
        roomEntity.setCurrentNumber(roomEntity.getCurrentNumber() - 1);
        roomRepository.save(roomEntity);
        return "success";
    }

    public String updateRoomGameById(String id, String gameId) {
        Optional<Room> roomEntityOptional = roomRepository.findById(id);
        if (roomEntityOptional.isEmpty()) {
            return "failed";
        }
        Room roomEntity = roomEntityOptional.get();
        roomEntity.setGameId(Integer.parseInt(gameId));
        roomRepository.save(roomEntity);
        return "success";
    }
}
