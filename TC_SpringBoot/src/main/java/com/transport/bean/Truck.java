package com.transport.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Truck_Table")
public class Truck {	
	@Id
	private String truck_no;
	private String model;
	private String owner;
	private String branch;
	private String capacity;
	private int rentperkm;
	private String insurance;
	
	public Truck() {
		
	}
	public Truck(String truck_no, String model, String owner, String branch, String capacity, int rentperkm,
			String insurance) {
		super();
		this.truck_no = truck_no;
		this.model = model;
		this.owner = owner;
		this.branch = branch;
		this.capacity = capacity;
		this.rentperkm = rentperkm;
		this.insurance = insurance;
	}
	
	public String getTruck_no() {
		return truck_no;
	}
	public void setTruck_no(String truck_no) {
		this.truck_no = truck_no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public int getRentperkm() {
		return rentperkm;
	}
	public void setRentperkm(int rentperkm) {
		this.rentperkm = rentperkm;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	@Override
	public String toString() {
		return "Truck [truck_no=" + truck_no + ", model=" + model + ", owner=" + owner + ", branch=" + branch
				+ ", capacity=" + capacity + ", rentperkm=" + rentperkm + ", insurance=" + insurance + "]";
	}
	
	
}
