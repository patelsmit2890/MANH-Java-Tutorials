/**
 * 
 */
package dialogbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane; //1
//import static javax.swing.JOptionPane.*; //2

/**
 * @author smpatel
 *
 */
public class dialogBox {

	/**
	 * @param args
	 */
	static JFrame frame;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dialogBox db = new dialogBox();
		/*frame = new JFrame("Show Message Dialog");
		JOptionPane.showMessageDialog(frame, "ergfergf");*/
	}


public dialogBox(){
	  frame = new JFrame("Show Message Dialog");
	  JButton button = new JButton("Click Me");
	  button.addActionListener(new MyAction());
	  frame.add(button);
	  frame.setSize(400, 400);
	  frame.setVisible(true);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }

	  public class MyAction implements ActionListener{
	  public void actionPerformed(ActionEvent e){
	  JOptionPane.showMessageDialog(frame, "Jay Swaminarayan"); //1
		  //showMessageDialog(frame, "Jay Swaminarayan"); //2
	  }
	  }
}