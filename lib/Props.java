package lib;

import java.util.*;
import java.io.*;

public class Props {
	
	private static File file;
	private static Log log;
	private static FileOutputStream fout;
	private static FileInputStream fin;
	private static Properties properties;
	
	public Props(String file_name) throws IOException, InterruptedException{
		try{
			log = new Log();
			file = new File("resources/" + file_name);
			log.logIt("Successfully initilized the file.");
			fin = new FileInputStream(file);
			log.logIt("Successfully initilized the FileInputStream.");
			properties = new Properties();
			loadAllProperties();
			log.logIt("Successfully loaded all the settings.");
		}
		catch(FileNotFoundException fnfe){
			System.err.println("Sorry did not find the file named \"" + file.getName() + "\"in " + file.getAbsolutePath());
			log.logIt("Sorry did not find the file named \"" + file.getName() + "\"in " + file.getAbsolutePath());
			System.out.println(fnfe.getMessage());
			log.logIt(fnfe.getMessage());
		}
		catch(UnsupportedOperationException uoe){
			System.err.println("Sorry an unsupported Exception occured.");
			System.out.println(uoe.getMessage());
			log.logIt(uoe.getMessage());
		}
		catch(SecurityException se){
			System.err.println("Sorry an security exception occured.");
			System.err.println("Did not have permission to read and write the file.");
			System.out.println(se.getMessage());
			log.logIt(se.getMessage());
		}
		catch(NullPointerException npe){
			System.out.println("Trying to read from a file where there is no data.");
			log.logIt(npe.getMessage());
			System.out.println(npe.getMessage());
		}
		catch(Exception e){
			System.out.println("Sorry an unidentified exception occured.");
			System.out.println(e.getMessage());
			log.logIt(e.getMessage());
		}
		
	}
	
	public static void loadAllProperties(){
		try{
			properties.load(fin);
		}
		catch(FileNotFoundException fnfe){
			System.err.println("Sorry did not find the file named \"" + file.getName() + "\"in " + file.getAbsolutePath());
			log.logIt("Sorry did not find the file named \"" + file.getName() + "\"in " + file.getAbsolutePath());
			System.out.println(fnfe.getMessage());
			log.logIt(fnfe.getMessage());
		}
		catch(UnsupportedOperationException uoe){
			System.err.println("Sorry an unsupported Exception occured.");
			System.out.println(uoe.getMessage());
			log.logIt(uoe.getMessage());
		}
		catch(SecurityException se){
			System.err.println("Sorry an security exception occured.");
			System.err.println("Did not have permission to read and write the file.");
			System.out.println(se.getMessage());
			log.logIt(se.getMessage());
		}
		catch(NullPointerException npe){
			System.out.println("Trying to read from a file where there is no data.");
			log.logIt(npe.getMessage());
			System.out.println(npe.getMessage());
		}
		catch(Exception e){
			System.out.println("Sorry an unidentified exception occured.");
			System.out.println(e.getMessage());
			log.logIt(e.getMessage());
		}
	}
	
	public void add(String key, String value){
		try{
			properties.put(key, value);
			fout = new FileOutputStream(file);
			properties.store(fout, "This file contains configuraions for the application to run.");
			log.logIt("Successfully added the " + key + " with value = " + value);
		}
		catch(FileNotFoundException fnfe){
			System.err.println("Sorry did not find the file named \"" + file.getName() + "\"in " + file.getAbsolutePath());
			log.logIt("Sorry did not find the file named \"" + file.getName() + "\"in " + file.getAbsolutePath());
			System.out.println(fnfe.getMessage());
			log.logIt(fnfe.getMessage());
		}
		catch(UnsupportedOperationException uoe){
			System.err.println("Sorry an unsupported Exception occured.");
			System.out.println(uoe.getMessage());
			log.logIt(uoe.getMessage());
		}
		catch(SecurityException se){
			System.err.println("Sorry an security exception occured.");
			System.err.println("Did not have permission to read and write the file.");
			System.out.println(se.getMessage());
			log.logIt(se.getMessage());
		}
		catch(NullPointerException npe){
			System.out.println("Trying to read from a file where there is no data.");
			log.logIt(npe.getMessage());
			System.out.println(npe.getMessage());
		}
		catch(Exception e){
			System.out.println("Sorry an unidentified exception occured.");
			System.out.println(e.getMessage());
			log.logIt(e.getMessage());
		}
	}
	
	public String getProperty(String key){
		return properties.getProperty(key);
	}
	
	public void setProperty(String key, String value){
		try{
			if(properties.getProperty(key).equals("null")){
                                System.out.println("No such property named " + key + " found.");
			}
			else{
                                properties.setProperty(key,value);
				properties.store(fout, "This file contains configuraions for the application to run.");
			}
		}
		catch(UnsupportedOperationException uoe){
			System.err.println("Sorry an unsupported Exception occured.");
			System.out.println(uoe.getMessage());
			log.logIt(uoe.getMessage());
		}
		catch(SecurityException se){
			System.err.println("Sorry an security exception occured.");
			System.err.println("Did not have permission to read and write the file.");
			System.out.println(se.getMessage());
			log.logIt(se.getMessage());
		}
		catch(NullPointerException npe){
			System.out.println("Trying to read from a file where there is no data.");
			log.logIt(npe.getMessage());
			System.out.println(npe.getMessage());
		}
		catch(Exception e){
			System.out.println("Sorry an unidentified exception occured.");
			System.out.println(e.getMessage());
			log.logIt(e.getMessage());
		}
	}
}
