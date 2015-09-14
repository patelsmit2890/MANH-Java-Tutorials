package ma.testq_quest_1;

import java.io.OutputStreamWriter;
/**
 * 
 */

/**
 * @author SmPatel
 *
 */
public class QuizMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quiz quiz = new Quiz();
		for(int i = 0; i < args.length && i < quiz.length(); i++){
			quiz.markQuest(args[i]);
		}
		quiz.printResults(new OutputStreamWriter(System.out));

	}

}
