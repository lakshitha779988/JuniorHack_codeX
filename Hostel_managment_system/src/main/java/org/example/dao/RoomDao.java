package org.example.dao;

import org.example.model.Hostel;
import org.example.model.Room;
import org.example.model.Student;


import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDao{

    private Connection connection;
    public RoomDao(){
        this.connection = DatabaseConnection.getConnection();
    }


    //create
    public void addRoom(Room room){
        String query = "INSERT INTO room (room_num,capacity,avilable_capacity , hostel_id) VALUES (?,?,?,?)";
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1,room.getRoom_num());
            ps.setInt(2,room.getCapacity());
            ps.setInt(3,room.getAvilable_capacity());
            ps.setInt(4,room.getHostelId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Read
    public List<Room> getRoomDetails(){
        List<Room> rooms = new ArrayList<>();

        String query = "SELECT * FROM room";
        try(Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query)){

            while (rs.next()){
                Room room =  new Room();
                room.setRoom_num(rs.getInt("room_num"));
                room.setCapacity(rs.getInt("capacity"));
                room.setAvilable_capacity(rs.getInt("avilable_capacity"));
                room.setHostelId(rs.getInt("hostel_id"));
                rooms.add(room);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return rooms;
    }


    //update
    public void updateRooms(Room room)  {
        String query = "UPDATE room SET room_num = ? , capacity = ? , avilable_capacity= ? WHERE id = ?";
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1,room.getRoom_num());
            ps.setInt(2,room.getCapacity());
            ps.setInt(4,room.getAvilable_capacity());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    //delete
    public void deleteRooms(int id){
        String quary = "DELETE FROM room WHERE id = ?";
        try(PreparedStatement ps = connection.prepareStatement(quary)){
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
