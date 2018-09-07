package com.jameschen.exercise.roomreservation.entity;

import java.io.Serializable;

public class RoomEntity implements Serializable {

    private long id;
    private String name;
    private String number;
    private String bedInfo;
    
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBedInfo() {
		return bedInfo;
	}
	public void setBedInfo(String bedInfo) {
		this.bedInfo = bedInfo;
	}
	
    
    
	
}
