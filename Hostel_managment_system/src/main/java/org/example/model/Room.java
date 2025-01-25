package org.example.model;

public class Room {
    private String room_id;

    private int room_num;
    private int capacity;
    private int avilable_capacity;

    public String getRoo_id() {
        return room_id;
    }

    public void setRoo_id(String room_id) {
        this.room_id = room_id;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
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
