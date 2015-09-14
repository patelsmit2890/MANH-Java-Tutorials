package model;

//Wrapper Bean

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="Customer",eager=true)
@RequestScoped
public class Customer implements Serializable {
	
	@ManagedProperty(value="#{name}")
	private Name nameBean;
	
	private String fname;
	private String lname;

	public void setNameBean(Name nameBean) {
		this.nameBean = nameBean;
	}

	public String getFname() {
		if(nameBean!=null){
			fname=nameBean.getFname();
		}
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		if(nameBean!=null){
			lname=nameBean.getLname();
		}
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}
