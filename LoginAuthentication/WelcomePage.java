package LoginAuthentication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import com.sun.prism.Image;

public class WelcomePage implements ActionListener{
	JFrame frame = new JFrame();
	JLabel welcomeLabel;
	JButton jContinue = new JButton("Continue");

	WelcomePage(String userName){
		frame.setTitle(userName);
		jContinue.setFocusable(false);
		welcomeLabel = new JLabel("Hello "+ userName +"  Welcome Welcome...");
		welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
		welcomeLabel.setBounds(0,0,200,200);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		ImageIcon img = new ImageIcon("D:\\LoginAuthentication\\Piano\\cat.gif");
		JLabel jImg = new JLabel(img);
		jImg.setSize(500,800);
		frame.setLayout(new BorderLayout());
		frame.add(jImg, BorderLayout.CENTER);
		frame.add(welcomeLabel, BorderLayout.NORTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		jContinue.addActionListener(this);
		frame.add(jContinue, BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == jContinue){
			frame.dispose();
			new SwingCalculator();
		}
	}
}
