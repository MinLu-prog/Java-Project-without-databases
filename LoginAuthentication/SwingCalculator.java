package LoginAuthentication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingCalculator extends JFrame implements ActionListener, ItemListener{
	public TextField txt;
	String str1="";
	String str2="";
	String operator="";
	Boolean check1= true;
	public SwingCalculator(){
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(4,4,5,5));
		jp1.add(creatButton("7"));
		jp1.add(creatButton("8"));
		jp1.add(creatButton("9"));
		jp1.add(creatButton("+"));
		jp1.add(creatButton("4"));
		jp1.add(creatButton("5"));
		jp1.add(creatButton("6"));
		jp1.add(creatButton("-"));
		jp1.add(creatButton("1"));
		jp1.add(creatButton("2"));
		jp1.add(creatButton("3"));
		jp1.add(creatButton("*"));
		jp1.add(creatButton("C"));
		jp1.add(creatButton("0"));
		jp1.add(creatButton("="));
		jp1.add(creatButton("/"));
		setLayout(new BorderLayout());
		txt = new TextField();
		add(txt,BorderLayout.NORTH);
		add(jp1, BorderLayout.CENTER);
		setTitle("Test Font and Color");
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	public JButton creatButton(String title){
		JButton jb = new JButton(title);
		jb.addActionListener(this);
		return jb;
	}
	public static void main(String[] args) {
		new SwingCalculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if("0123456789".contains(str)){
			txt.setText(txt.getText() + str);
			if(check1){
				str1 += str;
			}
			else {
				str2 += (str);			}
		}
	    else if(e.getActionCommand().equals("C")){
	    	txt.setText("");
	    	check1 = true;
	    	operator = "";
	    	str1 ="";
	    	str2="";
	    }
	    else if("+-*/".contains(str)){
	    	txt.setText(txt.getText() + str);
	    	operator = str;
	    	check1=false;
	    }
	    else if(e.getActionCommand().equals("=")){
	    	txt.setText(txt.getText() + str);
	    	int num1 = Integer.parseInt(str1);
	    	int num2 = Integer.parseInt(str2);
	    	int sum = 0;
	    	switch(operator){
	    	case "+": sum = num1+num2;
	    	break;
	    	case "-":sum = num1-num2;
	    	break;
	    	case "*":sum = num1*num2;
	    	break;
	    	case "/":sum = num1/num2;
	    	break;
	    	}
	    	txt.setText(txt.getText() + sum);
	    }
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

}
