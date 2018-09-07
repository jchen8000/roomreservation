package com.jameschen.exercise.roomreservation.mapper;

import java.util.List;

import com.jameschen.exercise.roomreservation.entity.RoomEntity;

public interface RoomMapper {
	List<RoomEntity> getAll();
	
	List<RoomEntity> getByName(String name);
	
	RoomEntity getByID(Long id);
}
