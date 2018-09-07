package com.jameschen.exercise.roomreservation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jameschen.exercise.roomreservation.entity.GuestEntity;
import com.jameschen.exercise.roomreservation.entity.RoomEntity;
import com.jameschen.exercise.roomreservation.mapper.RoomMapper;

@RestController
public class RoomController {

	@Autowired
	private RoomMapper roomMapper;
	
	@RequestMapping("/getRooms")
	public List<RoomEntity> getRooms() {
		List<RoomEntity> rooms=roomMapper.getAll();
		return rooms;
	}

	@RequestMapping("/getRoomByName/{name}")
	public List<RoomEntity> getRoomByName(@PathVariable String name) {
		List<RoomEntity> rooms=roomMapper.getByName(name);
		return rooms;
	}	
	
	@RequestMapping("/getRoomByID/{id}")
	public RoomEntity getRoomByID(@PathVariable long id) {
		RoomEntity room=roomMapper.getByID(id);
		return room;
	}		
	
}
