package org.example.model;

public class Room {
    private int room_id;

    private int room_num;
    private int capacity;
    private int avilable_capacity;
    private int hostel_id;




    public int getRoom_id() {
        return room_id;
    }

    public int getHostelId() {
        return hostel_id;
    }

    public void setHostelId(int hostelId) {
        this.hostel_id = hostelId;
    }

    public int getRoom_num() {
        return room_num;
    }

    public void setRoom_num(int room_num) {
        this.room_num = room_num;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAvilable_capacity() {
        return avilable_capacity;
    }

    public void setAvilable_capacity(int avilable_capacity) {
        this.avilable_capacity = avilable_capacity;
    }
}
