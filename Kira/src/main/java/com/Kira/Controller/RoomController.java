package com.Kira.Controller;

import com.Kira.Entity.Model.Room;
import com.Kira.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping("/room")
    public String createRoom(@RequestBody Room room) {
        return roomService.createRoom(room);
    }

    @GetMapping("/room/all")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    @PutMapping("/room/{id}")
    public String updateRoomById(@PathVariable String id, @RequestBody Room room) {
        return roomService.updateRoomById(id, room);
    }

    @PatchMapping("/room/{id}/password")
    public String updateRoomPassword(@PathVariable String id, @RequestBody String password) {
        return roomService.updateRoomPassword(id, password);
    }

    @PatchMapping("/room/{id}/status")
    public String updateRoomStatusById(@PathVariable String id, @RequestBody String status) {
        return roomService.updateRoomStatus(id, status);
    }

    @PatchMapping("/room/{id}/enter")
    public String enterRoom(@PathVariable String id, @RequestBody String password) {
        return roomService.enterRoom(id, password);
    }

    @PatchMapping("/room/{id}/leave")
    public String leaveRoom(@PathVariable String id) {
        return roomService.leaveRoom(id);
    }
    @GetMapping("/room/{id}")
    public Optional<Room> getRoomById(@PathVariable String id) {
        return roomService.getRoomById(id);
    }

    @DeleteMapping("/room/{id}")
    public void deleteRoomById(@PathVariable String id) {
        roomService.deleteRoomById(id);
    }
}