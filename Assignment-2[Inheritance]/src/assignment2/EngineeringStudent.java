/**
 * 
 */
package assignment2;

/**
 * @author SmPatel
 *
 */
public class EngineeringStudent extends Student {
	
	String branchName;

	public double percent(){
    	return((double)((this.scoreFirstSubject+this.scoreSecondSubject)/2));
    }
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
}
