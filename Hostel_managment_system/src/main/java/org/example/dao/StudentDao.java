package org.example.dao;

import org.example.model.Student;


import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao{

    private Connection connection;
    public StudentDao(){
        this.connection = DatabaseConnection.getConnection();
    }


    //create
    public void addStudent(Student student){
        String query = "INSERT INTO student (name,age,department) VALUES (?,?,?)";

        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1,student.getName());
            ps.setInt(2,student.getAge());
            ps.setString(3,student.getDepartment());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Read
    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();

        String query = "SELECT * FROM student";
        try(Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query)){

            while (rs.next()){
                Student student =  new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setDepartment(rs.getString("department"));
                students.add(student);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return students;
    }


    //update
    public void updateStudents(Student student)  {
        String query = "UPDATE student SET name = ? , age = ?, department= ? WHERE id = ?";
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1,student.getName());
            ps.setInt(2,student.getAge());
            ps.setInt(3,student.getId());
            ps.setString(4,student.getDepartment());
            ps.setInt(4,student.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    //delete
    public void deleteStudent(int id){
        String quary = "DELETE FROM student WHERE id = ?";
        try(PreparedStatement ps = connection.prepareStatement(quary)){
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
