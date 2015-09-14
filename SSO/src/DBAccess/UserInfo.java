package DBAccess;

import java.io.Serializable;
import java.util.ArrayList;

public class UserInfo implements Serializable {
	private static String name;
	private ArrayList<String> resources;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getResources() {
		Database db=new Database();
		this.setResources(db.getResources(name));
		return resources;
	}
	public void setResources(ArrayList<String> resources) {
		this.resources = resources;
	}
	
}
