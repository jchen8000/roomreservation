package com.jameschen.exercise.roomreservation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jameschen.exercise.roomreservation.entity.GuestEntity;
import com.jameschen.exercise.roomreservation.mapper.GuestMapper;

@RestController
public class GuestController {

	@Autowired
	private GuestMapper guestMapper;
	
	
	@RequestMapping("/getGuests")
	public List<GuestEntity> getGuests() {
		List<GuestEntity> guests=guestMapper.getAll();
		return guests;
	}
	
	@RequestMapping("/getGuest/{id}")
	public GuestEntity getGuest(@PathVariable long id) {
		GuestEntity guest=guestMapper.getOne(id);
		return guest;
	}	

	@RequestMapping("/getGuestByName/{name}")
	public List<GuestEntity> getGuestByName(@PathVariable String name) {
		List<GuestEntity> guests=guestMapper.getByName(name);
		return guests;
	}	
	
	
	@DeleteMapping("/deleteGuest/{id}")
	public GuestEntity deleteGuest(@PathVariable long id) {
		GuestEntity guest=guestMapper.getOne(id);
		guestMapper.delete(id);
		return guest;
	}
	
	@PostMapping("/addGuest")
	public List<GuestEntity>  createGuest(@RequestBody GuestEntity guest) {
		guestMapper.insert(guest);

		List<GuestEntity> guests=guestMapper.getAll();
		return guests;

	}
}
