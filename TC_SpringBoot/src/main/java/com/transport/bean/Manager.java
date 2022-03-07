package com.transport.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Manager_Table")
public class Manager {
	private String name;
	private String password;
	private String phoneno;
	private String mailid;
	@Id
	private String branch;
	private String doj;
	private int salary;
	
	public Manager() {
		
	}
	public Manager(String name, String password, String phoneno, String mailid, String branch, String doj, int salary) {
		super();
		this.name = name;
		this.password = password;
		this.phoneno = phoneno;
		this.mailid = mailid;
		this.branch = branch;
		this.doj = doj;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
