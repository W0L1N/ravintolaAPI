package com.kacwol.ravintolaAPI.reservation.service;

import com.kacwol.ravintolaAPI.reservation.ReservationDto;
import com.kacwol.ravintolaAPI.reservation.service.ReservationMapper;
import com.kacwol.ravintolaAPI.reservation.service.ReservationRepo;
import com.kacwol.ravintolaAPI.seattable.SeatTable;
import com.kacwol.ravintolaAPI.seattable.SeatTableService;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    private final ReservationRepo repo;

    private final ReservationMapper mapper;

    private final SeatTableService tableService;

    public ReservationService(ReservationRepo repo, ReservationMapper mapper, SeatTableService tableService) {
        this.repo = repo;
        this.mapper = mapper;
        this.tableService = tableService;
    }

    public void addReservation(ReservationDto dto){
        SeatTable table = tableService.getEntityById(dto.getTableId());
        repo.save(mapper.dtoToEntity(dto,table));
    }


}
