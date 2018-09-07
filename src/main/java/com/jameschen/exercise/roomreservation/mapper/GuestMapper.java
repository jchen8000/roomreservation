package com.jameschen.exercise.roomreservation.mapper;

import java.util.List;

import com.jameschen.exercise.roomreservation.entity.GuestEntity;

public interface GuestMapper {
	
	List<GuestEntity> getAll();
	
	List<GuestEntity> getByName(String name);
	
	void delete(Long id);
	
	GuestEntity getOne(Long id);
	
	void insert(GuestEntity guest);

}
