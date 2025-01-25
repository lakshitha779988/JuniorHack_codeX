package org.example.service;

import org.example.dao.HostelDao;
import org.example.dao.StudentDao;
import org.example.model.Hostel;
import org.example.model.Student;

import java.util.List;

public class HostelService {


    private HostelDao hostelDao;

    public HostelService(HostelDao hostelDao) {
        this.hostelDao = hostelDao;
    }

    public void addHostel(Hostel hostel){
        hostelDao.addHostel(hostel);
    }

    public void updateHostel(Hostel hostel){
        hostelDao.updateHostel(hostel);
    }


    public List<Hostel> getAllHostel(){
        return hostelDao.getHostelDetails();
    }

    public void deleteHostel(int id){
        hostelDao.deleteHostel(id);
    }
}
