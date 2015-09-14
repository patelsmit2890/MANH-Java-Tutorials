package DBAccess;

import java.io.Serializable;
import java.util.HashMap;

public class UserBean implements Serializable{
	
	private HashMap<String, String> users;

	public HashMap<String, String> getUsers() {
		Database userCon = new Database();
		this.setUsers(userCon.getUserData());
		return this.users;
	}

	public void setUsers(HashMap<String, String> users) {
		this.users = users;
	}
	
	

}
