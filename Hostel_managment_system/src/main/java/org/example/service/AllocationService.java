package org.example.service;

import org.example.dao.AllocationDao;
import org.example.dao.HostelDao;
import org.example.model.Allocation;
import org.example.model.Hostel;

import java.util.List;

public class AllocationService {


    private AllocationDao allocationDao;

    public AllocationService(AllocationDao allocationDao) {
        this.allocationDao = allocationDao;
    }

    public void addAllocation(Allocation allocation){
        allocationDao.addAllocation(allocation);
    }

    public void UpdateAllocation(Allocation allocation){
        allocationDao.updateAllocation(allocation);
    }


    public List<Allocation> getAllAllocation(){
        return allocationDao.getAllAllocation();
    }

    public void deleteAllocation(int id){
        allocationDao.deleteAllocation(id);
    }
}
