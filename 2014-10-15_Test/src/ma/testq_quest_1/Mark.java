/**
 * 
 */
package ma.testq_quest_1;

/**
 * @author SmPatel
 *
 */
public class Mark {

	String correct;
	String answered;

	public Mark(String correct, String answered) {
		super();
		this.correct = correct;
		this.answered = answered;
	}

	public String getCorrect() {
		return correct;
	}

	public void setCorrect(String correct) {
		this.correct = correct;
	}

	public String getAnswered() {
		return answered;
	}

	public void setAnswered(String answered) {
		this.answered = answered;
	}
	
	public Result getResult(){
		if(answered.equals(correct)){
			return Result.CORRECT;
		}
		else if(answered.equals("X")){
			return Result.UNANSWERED;
		}
		else{
			return Result.WRONG;
		}
	}

}
