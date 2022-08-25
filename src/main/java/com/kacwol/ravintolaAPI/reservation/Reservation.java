package com.kacwol.ravintolaAPI.reservation;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.kacwol.ravintolaAPI.seattable.SeatTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String email;

    private int peopleAmount;

    @JsonFormat(pattern = "DD-MM-YYYY hh:mm")
    private LocalDateTime dateTime;

    @ManyToOne
    private SeatTable table;
}
