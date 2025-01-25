package org.example.dao;

import org.example.model.Hostel;
import org.example.model.Student;


import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HostelDao{

    private Connection connection;
    public HostelDao(){
        this.connection = DatabaseConnection.getConnection();
    }


    //create
    public void addHostel(Hostel hostel){
        String query = "INSERT INTO hostel (hostel_name,num_of_rooms) VALUES (?,?)";

        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1,hostel.getHostel_name());
            ps.setInt(2,hostel.getNum_of_rooms());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Read
    public List<Hostel> getHostelDetails(){
        List<Hostel> hostels = new ArrayList<>();

        String query = "SELECT * FROM hostel";
        try(Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query)){

            while (rs.next()){
                Hostel hostel =  new Hostel();
                hostel.setHostel_id(rs.getInt("hostel_id"));
                hostel.setHostel_name(rs.getString("hostel_name"));
                hostel.setNum_of_rooms(rs.getInt("num_of_rooms"));
              hostels.add(hostel);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return hostels;
    }


    //update
    public void updateHostel(Hostel hostel)  {
        String query = "UPDATE hostel SET hostel_name = ? , num_of_rooms = ? WHERE id = ?";
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1,hostel.getHostel_name());
            ps.setInt(2,hostel.getNum_of_rooms());
            ps.setInt(3,hostel.getHostel_id());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    //delete
    public void deleteHostel(int id){
        String quary = "DELETE FROM hostels WHERE id = ?";
        try(PreparedStatement ps = connection.prepareStatement(quary)){
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
