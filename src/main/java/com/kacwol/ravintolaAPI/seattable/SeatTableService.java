package com.kacwol.ravintolaAPI.seattable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatTableService {

    private SeatTableRepo repo;

    @Autowired
    public SeatTableService(SeatTableRepo repo) {
        this.repo = repo;
    }

    public SeatTable getEntityById(Long id){
        return repo.findById(id).orElseThrow();
    }

}
