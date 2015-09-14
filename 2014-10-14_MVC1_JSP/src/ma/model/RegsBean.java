/**
 * 
 */
package ma.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @author SmPatel
 *
 */
public class RegsBean implements Serializable {

	private String fname;
	private String lname;
	private String email;
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Collection<String> getValidation(){

		LinkedList< String> errmsg=new LinkedList<String>();

		if(fname==null || fname.length()<2){
			errmsg.add("Please enter a valid first name");
		}
		if(lname==null || lname.length()<2){
			errmsg.add("Please enter a valid last name");
		}
		if(email==null || !email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
			errmsg.add("Please enter a valid email id");
		}
		return errmsg;

	}


}
