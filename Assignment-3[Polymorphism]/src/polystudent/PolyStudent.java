/**
 * 
 */
package polystudent;

/**
 * @author SmPatel
 *
 */
public class PolyStudent extends Student{
	
	//overriding display method of Student class for showing Average marks additionally instead of calculating in separate method
	public void display(String rollNumber){
		if(this.getRollNumber().equals(rollNumber)){			
			if(getScoreFirstSubject()>getScoreSecondSubject()){
				System.out.println("Subject with highest marks: "+getFirstSubject());
				System.out.println("Marks: "+getScoreFirstSubject());
			}else{
				System.out.println("Subject with highest marks: "+getSecondSubject());
				System.out.println("Marks: "+getScoreSecondSubject());
			}
			double avg=0.0;
			avg=(getScoreFirstSubject()+getScoreSecondSubject())/2;
			System.out.println("Avg Marks of "+rollNumber+" for two suubject is: "+avg);
		}else{
			System.out.println("Student rollnuumber not exist.");
		}
	}

}
