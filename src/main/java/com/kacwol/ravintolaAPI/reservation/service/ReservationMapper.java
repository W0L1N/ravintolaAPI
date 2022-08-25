package com.kacwol.ravintolaAPI.reservation.service;

import com.kacwol.ravintolaAPI.reservation.Reservation;
import com.kacwol.ravintolaAPI.reservation.ReservationDto;
import com.kacwol.ravintolaAPI.seattable.SeatTable;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {

    public Reservation dtoToEntity(ReservationDto dto, SeatTable table){
        return Reservation.builder()
                .name(dto.getName())
                .surname(dto.getSurname())
                .email(dto.getEmail())
                .table(table)
                .peopleAmount(dto.getPeopleAmount())
                .dateTime(dto.getDateTime())
                .build();
    }

}
