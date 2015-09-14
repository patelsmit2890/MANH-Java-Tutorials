package DBAccess;

import java.io.Serializable;
import java.util.HashMap;

public class RoleBean implements Serializable {
	
	private HashMap<String, String> roles;

	public HashMap<String, String> getRoles() {
		Database roleCon = new Database();
		this.setRoles(roleCon.getRoleData());
		return roles;
	}

	public void setRoles(HashMap<String, String> roles) {
		this.roles = roles;
	}
	
	

}
