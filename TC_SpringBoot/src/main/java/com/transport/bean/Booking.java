package com.transport.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking_table")
public class Booking {
	private String model;
	@Id
	private String truck_no;
	private String fromdate;
	private String todate;
	private String fromlocation;
	private String tolocation;
	private String status;
	
	public  Booking() {
		
	}
	
	public Booking(String model, String truck_no, String fromdate, String todate, String fromlocation,
			String tolocation, String status) {
		super();
		this.model = model;
		this.truck_no = truck_no;
		this.fromdate = fromdate;
		this.todate = todate;
		this.fromlocation = fromlocation;
		this.tolocation = tolocation;
		this.status = status;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTruck_no() {
		return truck_no;
	}
	public void setTruck_no(String truck_no) {
		this.truck_no = truck_no;
	}
	public String getFromdate() {
		return fromdate;
	}
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	public String getFromlocation() {
		return fromlocation;
	}
	public void setFromlocation(String fromlocation) {
		this.fromlocation = fromlocation;
	}
	public String getTolocation() {
		return tolocation;
	}
	public void setTolocation(String tolocation) {
		this.tolocation = tolocation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Booking [model=" + model + ", truck_no=" + truck_no + ", fromdate=" + fromdate + ", todate=" + todate
				+ ", fromlocation=" + fromlocation + ", tolocation=" + tolocation + ", status=" + status + "]";
	}
	
}
