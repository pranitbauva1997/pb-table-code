package resources.data;

import java.awt.*;
import javax.swing.*;
public class test extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void makeGUI(){
		String text1 = "<html><a href = \"http://www.google.com\">Google</a></html>";
		JButton button1 = new JButton(text1);
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		add(button1);
	}
	public static void main(String args[]){
		try{
			new test().makeGUI();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
