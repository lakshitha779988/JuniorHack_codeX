package org.example.dao;

import org.example.model.Allocation;
import org.example.model.Hostel;
import org.example.model.Student;


import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AllocationDao{

    private Connection connection;
    public AllocationDao(){
        this.connection = DatabaseConnection.getConnection();
    }


    //create
    public void addAllocation(Allocation allocation){
        String query = "INSERT INTO allocation (student_id,room_id,allocation_Date) VALUES (?,?,?)";

        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1,allocation.getStudentId());
            ps.setInt(2,allocation.getRoomId());
            ps.setString(3 , allocation.getAllocation_Date());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Read
    public List<Allocation> getAllAllocation(){
        List<Allocation> allocations = new ArrayList<>();

        String query = "SELECT * FROM allocation";
        try(Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query)){

            while (rs.next()){
                Allocation allocation =  new Allocation();
                allocation.setStudentId(rs.getInt("student_id"));
                allocation.setRoomId(rs.getInt("room_id"));
                allocation.setAllocation_Date(rs.getString("allocation_Date"));
                allocations.add(allocation);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return allocations;
    }


    //update
    public void updateAllocation(Allocation allocation)  {
        String query = "UPDATE al SET student_id = ?,room_id = ?,allocation_Date =?  WHERE id = ?";
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1,allocation.getStudentId());
            ps.setInt(2,allocation.getRoomId());
            ps.setString(4,allocation.getAllocation_Date());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    //delete
    public void deleteAllocation(int id){
        String quary = "DELETE FROM allocation WHERE id = ?";
        try(PreparedStatement ps = connection.prepareStatement(quary)){
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
