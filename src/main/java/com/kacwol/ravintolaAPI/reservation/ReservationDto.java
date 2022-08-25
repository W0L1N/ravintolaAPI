package com.kacwol.ravintolaAPI.reservation;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ReservationDto {

    private String name;

    private String surname;

    private String email;

    private int peopleAmount;

    @JsonFormat(pattern = "DD-MM-YYYY hh:mm")
    private LocalDateTime dateTime;

    private Long tableId;

}
