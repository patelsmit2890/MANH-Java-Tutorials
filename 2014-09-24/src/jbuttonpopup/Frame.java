package jbuttonpopup;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*class BtnLsnr implements ActionListener {
	public void actionPerformed(ActionEvent e) {

		Object src = (JButton) e.getSource();
		if (src instanceof JButton) {
			JButton srcBtn = (JButton) src;
			if (srcBtn.getText().equals("Exit")) {
				JOptionPane.showMessageDialog(null, "Clicked", "",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}*/
public class Frame extends JFrame{

	/**
	 * @param args
	 */
	JButton btnExit, btnSave;
	Frame() {
		// TODO Auto-generated constructor stub

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		getContentPane().setLayout(new FlowLayout());
		btnSave = new JButton("Save");
		btnExit = new JButton("Exit");		
		getContentPane().add(btnSave);
		getContentPane().add(btnExit);		
		BtnLsnr b1 = new BtnLsnr();
		btnSave.addActionListener(b1);
		btnExit.addActionListener(b1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame();
	}
	class BtnLsnr implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			Object src = (JButton)e.getSource();
			if (src instanceof JButton) {
				JButton srcBtn = (JButton) src;
				if(srcBtn==btnExit)
				{
					btnExit.setText("Existing..");
				}
				/*if (srcBtn.getText().equals("Exit")) {
					JOptionPane.showMessageDialog(null, "Clicked", "",
							JOptionPane.INFORMATION_MESSAGE);
				}*/
			}
		}
	}

}
