package model.entities;

import java.io.Serializable;

public class Employee implements Serializable {
	private int eid;
	private String first_name;
	private String last_name;
	private int salary;
	private String phone;
	
	public Employee(){
		
	}
	
	public Employee(String fname,String lname,int salary,String phone){
		this.first_name=fname;
		this.last_name=lname;
		this.salary=salary;
		this.phone=phone;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
