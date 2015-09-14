/**
 * 
 */
package assignment1;

/**
 * @author SmPatel
 *
 */
public class Student {

	/**
	 * @param args
	 */
	private String rollNumber;
	private String studentName;
	private String courseName;	 
	private String firstSubject;
	private double scoreFirstSubject;
	private String secondSubject;
	private double scoreSecondSubject;
	/**
	 * @return the rollNumber
	 */
	public String getRollNumber() {
		return rollNumber;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @return the firstSubject
	 */
	public String getFirstSubject() {
		return firstSubject;
	}
	/**
	 * @return the scoreFirstSubject
	 */
	public double getScoreFirstSubject() {
		return scoreFirstSubject;
	}
	/**
	 * @return the secondSubject
	 */
	public String getSecondSubject() {
		return secondSubject;
	}
	/**
	 * @return the scoreSecondSubject
	 */
	public double getScoreSecondSubject() {
		return scoreSecondSubject;
	}	

	//setDetails method for setting values
	public void setDetails(String rollNumber,String studentName,String courseName,String firstSubject,double scoreFirstSubject,
			String secondSubject,double scoreSecondSubject) {
		if(rollNumber.matches("[A-Za-z0-9]+"))
		{
			this.rollNumber=rollNumber;
		}else
		{
			System.out.println("Please enter correct Roll number");
			System.exit(0);
		}

		if(studentName.matches("[A-Za-z]+"))
		{
			this.studentName=studentName;

		}else
		{
			System.out.println("Please enter valid Student Name. Only Alphabets Allowed.");
			System.exit(0);
		}

		if(courseName.matches("[A-Za-z]+"))
		{
			this.courseName=courseName;

		}else
		{
			System.out.println("Please enter valid Course Name. Only Alphabets Allowed.");
			System.exit(0);
		}

		if(firstSubject.matches("[A-Za-z0-9\\s]+"))
		{
			this.firstSubject=firstSubject;

		}else
		{
			System.out.println("Please enter valid First Subject Name. Only Alphanumeric and space Allowed.");
			System.exit(0);
		}

		try
		{
			if(verifyScore(scoreFirstSubject)){
				this.scoreFirstSubject=scoreFirstSubject;
			}
			else{
				System.out.println("Please enter valid First Subject Score between 0 and 100.");
				System.exit(0);
			}

		}catch(NumberFormatException e)
		{
			System.out.println("Please enter valid First Subject Score.");			
		}

		if(secondSubject.matches("[A-Za-z0-9\\s]+"))
		{
			this.secondSubject=secondSubject;

		}else
		{
			System.out.println("Please enter valid Second Subject Name. Only Alphanumeric Allowed.");
			System.exit(0);
		}

		try
		{
			if(verifyScore(scoreFirstSubject)){
				this.scoreSecondSubject=scoreSecondSubject;
			}else{
				System.out.println("Please enter valid Second Subject Score between 0 and 100.");
				System.exit(0);
			}

		}catch (Exception e) {
			System.out.println("Please enter valid Second Subject Score.");			
		}
		//System.out.println("Details saved sucessfully");
	}
	
	//display method for displaying subject with highest marks
	public void display(String rollNumber){
		if(verifyRollNum(rollNumber)){
			if(this.scoreFirstSubject>this.scoreSecondSubject){
				System.out.println("Subject with highest marks: "+firstSubject);
				System.out.println("Marks: "+scoreFirstSubject);
			}else{
				System.out.println("Subject with highest marks: "+secondSubject);
				System.out.println("Marks: "+scoreSecondSubject);
			}
		}else{
			System.out.println("Student rollnuumber not exist.");
		}
	}
	
	//avgMarks method for displaying average marks
	public double avgMarks(String rollNumber){
		double avg=0;
		if(verifyRollNum(rollNumber)){
			avg=(scoreFirstSubject+scoreSecondSubject)/2;
			//System.out.println("Avg Marks of "+rollNumber+" is: "+avg);
		}else{
			System.out.println("Rollnumber not exist.");
			System.exit(0);
		}
		return avg;

	}
	
	//Additional method for verifying score entered is between 0 and 100 or not
	public boolean verifyScore(double scoreFirstSubject)
	{
		if(scoreFirstSubject<100 && scoreFirstSubject>0)
		{
			return true;
		}else{
			return false;
		}
	}
	
	//Additional method for checking verifying roll number
		public boolean verifyRollNum(String rollNumber)
		{
			if(this.rollNumber.equals(rollNumber))
			{
				return true;
			}else{
				return false;
			}
		}

		//displayStudentDetails method for displaying whole student details
	public void displayStudentDetails(String rollNumber){
		if(this.rollNumber.equals(rollNumber)){		
			System.out.println("Rollnumber: "+rollNumber);
			System.out.println("Name of the Student: "+this.studentName);
			System.out.println("Course Name: "+this.courseName);
			System.out.println("First Subject: "+this.firstSubject+ " and Marks: "+this.scoreFirstSubject);			
			System.out.println("Second Subject: "+ this.secondSubject+" and Marks: "+this.scoreSecondSubject);			
			System.out.println("Avg Marks of "+rollNumber+" is: "+avgMarks(rollNumber));
		}else{
			System.out.println("Rollnumber not exist.Please enter correct roll number");
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Test driver and use TestStudent[using JUnit] for testing purpose
		Student st=new Student();
		st.setDetails("12IT16F", "Alan", "IT", "Distributed Computing", 85.52, "Advanced DBMS", 80.45);		
		//st.display("12IT16F");
		//System.out.println("Avg Marks is: "+st.avgMarks("12IT16F"));
		st.displayStudentDetails("12IT16F");
	}

}

