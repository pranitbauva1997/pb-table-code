package lib;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Log{
	/**
	 * 
	 */
	private File file;
	private FileOutputStream fout;
	private FileInputStream fin;
	private GregorianCalendar gcal;
	
	public Log(){
		try{
			file = new File("resources/periodicTable.log");
			fout = new FileOutputStream(file,true);
			fin = new FileInputStream(file);
		}
		catch(FileNotFoundException fnfe){
			System.err.println("Sorry did not find the file named \"" + file.getName() + "\"in " + file.getAbsolutePath());
			System.out.println(fnfe.getMessage());
		}
		catch(UnsupportedOperationException uoe){
			System.err.println("Sorry an unsupported Exception occured.");
			System.out.println(uoe.getMessage());
		}
		catch(SecurityException se){
			System.err.println("Sorry an security exception occured.");
			System.err.println("Did not have permissions to read and write to the log file.");
			System.out.println(se.getMessage());
		}
		catch(Exception e){
			System.out.println("Sorry an unidentified exception occured.");
		}
	}
	
	
	public void logIt(String to_be_logged){
		gcal = new GregorianCalendar();
		Integer d = new Integer(gcal.get(Calendar.DATE));StringBuffer date = new StringBuffer(d.toString());
		Integer m = new Integer(gcal.get(Calendar.MONTH));++m;StringBuffer month = new StringBuffer(m.toString());
		Integer y = new Integer(gcal.get(Calendar.YEAR));StringBuffer year = new StringBuffer(y.toString());
		Integer h = new Integer(gcal.get(Calendar.HOUR));StringBuffer hour = new StringBuffer(h.toString());
		Integer mn = new Integer(gcal.get(Calendar.MINUTE));StringBuffer minute = new StringBuffer(mn.toString());
		Integer s = new Integer(gcal.get(Calendar.SECOND));StringBuffer second = new StringBuffer(s.toString());
		
		if(date.length() == 1){
			date.insert(0, 0);
		}
		if(month.length() == 1){
			month.insert(0, 0);
		}
		if(year.length() == 1){
			year.insert(0, 0);
		}
		if(hour.length() == 1){
			hour.insert(0, 0);
		}
		if(minute.length() == 1){
			minute.insert(0, 0);
		}
		if(second.length() == 1){
			second.insert(0, 0);
		}
		
		String to_be_logged1 = date + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second + "  " + to_be_logged + "\n";
		byte buf[] = to_be_logged1.getBytes();
		try{
			fout.write(buf);
		}
		catch(FileNotFoundException fnfe){
			System.err.println("Sorry did not find the file named \"" + file.getName() + "\"in " + file.getAbsolutePath());
			System.out.println(fnfe.getMessage());
		}
		catch(UnsupportedOperationException uoe){
			System.err.println("Sorry an unsupported Exception occured.");
			System.out.println(uoe.getMessage());
		}
		catch(SecurityException se){
			System.err.println("Sorry an security exception occured.");
			System.err.println("Did not have permissions to read and write to the log file.");
			System.out.println(se.getMessage());
		}
		catch(Exception e){
			System.out.println("Sorry an unidentified exception occured.");
			System.out.println(e.getMessage());
		}
	}
	
	public void showLog(){
		try{
			//SwingUtilities.invokeAndWait(new Runnable(){
				//public void run(){
					showIt();
				//}
			//});
		}
		catch(Exception e){
			System.out.println("Sorry an exception occured.");
		}
		
	}
	
	public static void main(String args[]){
		try{
			new Log().logIt("This is us.");
			new Log().showLog();
		}
		catch(Exception e){
			System.out.println("Sorry an exception occured.");
			System.out.println(e.getMessage());
		}
	}
	
	private void showIt(){
		//set the frame
		final JFrame frame = new JFrame("Foodie : Log");
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//Set the Menus
		JMenuBar menubar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		menubar.add(fileMenu);
		JMenuItem exit = new JMenuItem("Exit");
		fileMenu.add(exit);
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}
		});
		frame.setJMenuBar(menubar);
		
		
		
		//set the panels
		JPanel panel1 = new JPanel();
		frame.setLayout(new BorderLayout());
		frame.add(panel1,BorderLayout.NORTH);
		panel1.setVisible(true);
		
		JPanel panel2 = new JPanel();
		frame.add(panel2);
		panel2.setVisible(true);
		
		
		//add various components
		JButton okay = new JButton("Okay");
		panel1.add(okay,BorderLayout.NORTH);
		okay.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}
		});
		
		//add the main log
		String logs = readLog();
		JTextArea textArea = new JTextArea(logs);
		JScrollPane scrollLog = new JScrollPane(textArea);
		frame.add(scrollLog,BorderLayout.CENTER);
		textArea.setEditable(false);
	}
	
	
	private String readLog(){
		StringBuffer logs = new StringBuffer("");
		try{
			while(fin.available() != 0){
				logs.append((char)fin.read());
			}
		}
		catch(FileNotFoundException fnfe){
			System.err.println("Sorry did not find the file named \"" + file.getName() + "\"in " + file.getAbsolutePath());
			System.out.println(fnfe.getMessage());
		}
		catch(UnsupportedOperationException uoe){
			System.err.println("Sorry an unsupported Exception occured.");
			System.out.println(uoe.getMessage());
		}
		catch(SecurityException se){
			System.err.println("Sorry an security exception occured.");
			System.err.println("Did not have permission to read and write the file.");
			System.out.println(se.getMessage());
		}
		catch(NullPointerException npe){
			System.out.println("Trying to read from a file where there is no data.");
			System.out.println(npe.getMessage());
		}
		catch(Exception e){
			System.out.println("Sorry an unidentified exception occured.");
			System.out.println(e.getMessage());
		}
		return (logs.toString());
	}
}
