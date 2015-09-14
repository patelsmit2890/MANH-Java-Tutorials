/**
 * 
 */
package ma.testq_quest_1;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SmPatel
 *
 */
public class Quiz {

	private String [] correctAnws = {"C", "A", "B", "D", "B", "C", "C", "A"};

	private static final int pass_mark = 5;

	int correct;
	int wrong;
	int unanswered;

	List<Mark> results;

	public Quiz() {
		super();
		correct = 0;
		wrong = 0;
		unanswered = 0;
		results = new ArrayList<Mark>();
	}
	
	public int length(){
		return correctAnws.length;
	}
	
	public void markQuest(String submittedAns){
		int correctAns = results.size();
		Mark mark = new Mark(correctAnws[correctAns], submittedAns);
		updtCounts(mark);
		results.add(mark);		
	}

	private void updtCounts(Mark mark){
		switch (mark.getResult()) {
		case CORRECT:
			correct++;				
			break;
		case WRONG:
			wrong++;
			break;
		case UNANSWERED:
			unanswered++;
			break;
		}		
	}	
	public String getGrade(){
		if(correct >= pass_mark){
			return "PASSED";
		}
		return "FAILED";
	}

	public String getResults(){
		StringWriter strWriter = new StringWriter();
		printResults(strWriter);		
		return strWriter.toString();
	}

	public void printResults(Writer writer){
		PrintWriter printWriter = new PrintWriter(writer);
		printWriter.println("Question Submitted Ans. Correct Ans. Result");
		for(int i = 0; i < results.size(); i++){
			Mark mark = results.get(i);
			printWriter.printf("%5d%11s%16s%16s%n", i+1, mark.getAnswered(), mark.getCorrect(), mark.getResult());
		}
		printWriter.println("No. of correct answers: " + correct);
		printWriter.println("No. of wrong answers: " + wrong);
		printWriter.println("No. of questions unanswered: " + unanswered);
		printWriter.print("The candidate : " + getGrade());
		printWriter.close();
	}

}
