package model;

import java.io.Serializable;

//Wrapping bean

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean(name="name",eager=true)
@RequestScoped
public class Name implements Serializable {
	private String fname="Smit";
	private String lname="Patel";
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}
