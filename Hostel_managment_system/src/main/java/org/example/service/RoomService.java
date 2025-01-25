package org.example.service;

import org.example.dao.HostelDao;
import org.example.dao.RoomDao;
import org.example.model.Hostel;
import org.example.model.Room;

import java.util.List;

public class RoomService {

private HostelDao hostelDao;
    private RoomDao roomDao;

    public RoomService(HostelDao hostelDao, RoomDao roomDao) {
        this.hostelDao = hostelDao;
        this.roomDao = roomDao;
    }

    public void addRoom(Room room){

        roomDao.addRoom(room);
    }

    public void updateRoom(Room room){
        roomDao.updateRooms(room);
    }


    public List<Room> getAllRoom(){
        return roomDao.getRoomDetails();
    }

    public void deleteRoom(int id){
        roomDao.deleteRooms(id);
    }
}
