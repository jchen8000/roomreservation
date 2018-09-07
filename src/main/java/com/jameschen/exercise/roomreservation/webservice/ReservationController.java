package com.jameschen.exercise.roomreservation.webservice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jameschen.exercise.roomreservation.entity.ReservationEntity;
import com.jameschen.exercise.roomreservation.mapper.ReservationMapper;

@RestController
public class ReservationController {

	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	
	
	@Autowired
	private ReservationMapper reservationMapper;
	
	@RequestMapping("/getReservations")
	public List<ReservationEntity> getReservations() {
		List<ReservationEntity> reservations=reservationMapper.getAll();
		return reservations;
	}
	

	@RequestMapping("/getReservation/{name}")
	public List<ReservationEntity> getReservationByName(@PathVariable String name) {
		List<ReservationEntity> reservations=reservationMapper.getByName(name);
		return reservations;
	}

	@RequestMapping("/getReservationByDate/{dateString}")
	public List<ReservationEntity> getReservationByDate(@PathVariable String dateString) {
		Date date = this.createDateFromDateString(dateString);
		List<ReservationEntity> reservations=reservationMapper.getByDate(new java.sql.Date(date.getTime()));
		return reservations;
	}
	
	@PostMapping("/addReservation")
	public List<ReservationEntity>  createGuest(@RequestBody ReservationEntity reservation) {
		
		reservationMapper.insert(reservation);

		List<ReservationEntity> reservations=reservationMapper.getAll();
		return reservations;

	}
	
	
    private Date createDateFromDateString(String dateString){
        Date date = null;
        if(null!=dateString) {
            try {
                date = DATE_FORMAT.parse(dateString);
            }catch(ParseException pe){
                date = new Date();
            }
        }else{
            date = new Date();
        }
        return date;
    }
}
