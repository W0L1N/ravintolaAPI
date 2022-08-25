package com.kacwol.ravintolaAPI.controller;

import com.kacwol.ravintolaAPI.reservation.ReservationDto;
import com.kacwol.ravintolaAPI.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reservation")
public class ReservationController {

    private ReservationService service;

    @Autowired
    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @PostMapping
    public void makeReservation(@RequestBody ReservationDto dto){
        service.addReservation(dto);
    }

}
