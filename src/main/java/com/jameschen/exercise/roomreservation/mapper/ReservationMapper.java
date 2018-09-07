package com.jameschen.exercise.roomreservation.mapper;

import java.sql.Date;
import java.util.List;

import com.jameschen.exercise.roomreservation.entity.ReservationEntity;

public interface ReservationMapper {

	List<ReservationEntity> getAll();
	
	List<ReservationEntity> getByName(String name);
	
	List<ReservationEntity> getByDate(Date date);
	
	void insert(ReservationEntity reservation);
	
}
