package com.Kira.Controller;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9036ed5 (basic crud apis)
import com.Kira.Entity.Model.Room;
import com.Kira.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
<<<<<<< HEAD

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

    @GetMapping("/room/{id}")
    public Optional<Room> getRoomById(@PathVariable String id) {
        return roomService.getRoomById(id);
    }

    @DeleteMapping("/room/{id}")
    public void deleteRoomById(@PathVariable String id) {
        roomService.deleteRoomById(id);
    }

    @PutMapping("/room/{id}")
    public String updateRoomById(@PathVariable String id, @RequestBody Room room) {
        return roomService.updateRoomById(id, room);
    }

    @PutMapping("/room/{id}/status")
    public String updateRoomStatusById(@PathVariable String id, @RequestBody String status) {
        return roomService.updateRoomStatus(id, status);
    }

    @PutMapping("/room/{id}/enter")
    public String enterRoom(@PathVariable String id, String password) {
        return roomService.enterRoom(id, password);
    }

    @PutMapping("/room/{id}/leave")
    public String leaveRoom(@PathVariable String id) {
        return roomService.leaveRoom(id);
    }
<<<<<<< HEAD
}
=======
import org.springframework.stereotype.Controller;
=======
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 6d4fdec (add some services)

@RestController
public class RoomController {
}
>>>>>>> 1522d02 (basic configuration)
=======

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

    @GetMapping("/room/{id}")
    public Optional<Room> getRoomById(@PathVariable String id) {
        return roomService.getRoomById(id);
    }

    @DeleteMapping("/room/{id}")
    public void deleteRoomById(@PathVariable String id) {
        roomService.deleteRoomById(id);
    }

    @PutMapping("/room/{id}")
    public String updateRoomById(@PathVariable String id, @RequestBody Room room) {
        return roomService.updateRoomById(id, room);
    }
}
>>>>>>> 9036ed5 (basic crud apis)
=======
}
>>>>>>> ce2e92a (update room apis)
