/**
 * 
 */
package DBAccess;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author SmPatel
 *
 */
public class ResourceBean implements Serializable {
	
	private HashMap<String, String> resource;

	public HashMap<String, String> getResource() { 
		Database rsrcCon = new Database();
		this.setResource(rsrcCon.getResourceData());
		return this.resource;
	}

	public void setResource(HashMap<String, String> resourceName) {
		this.resource = resourceName;
	}

}
