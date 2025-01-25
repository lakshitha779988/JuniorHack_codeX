package org.example.model;

public class Allocation {
    private int allocation_id;

    private int student_id;
    private int room_id;

    private String allocation_Date;

    public int getAllocation_id() {
        return allocation_id;
    }

    public void setAllocation_id(int allocation_id) {
        this.allocation_id = allocation_id;
    }


    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int studentId) {
        this.student_id = studentId;
    }

    public int getRoomId() {
        return room_id;
    }

    public void setRoomId(int roomId) {
        this.room_id = roomId;
    }

    public String getAllocation_Date() {
        return allocation_Date;
    }

    public void setAllocation_Date(String allocation_Date) {
        this.allocation_Date = allocation_Date;
    }
}
