package com.LockedMe;

import java.io.IOException;
import java.util.Scanner;

public class FilesManager {
	
	String developer_name = "Ashok patel";
	String Project_name = "Lock ers.pvt.ltd";
	
	FilesOperation  fo = new FilesOperation();
    
	
	//this methoud is use for displaying developer and project name in console 
	void get_productInfo()
	{
		System.out.println("Developer Name: " + developer_name + "\n" + "Project Name: " +Project_name);
	}
	
	//Print welcome message on console
	void printoptions() {
		
	System.out.println("   Welcome to your Locker\n"  + "Select below options What You want do\n"+"1 : list all files\n"+ "2 : Advance Options\n" + "3 : Close application\n" );
	}
	
	void printoptions2() {
		
		System.out.println( "Select below options What You want do\n"+"1 : list all files\n"+ "2 : Advance Options\n" + "3 : Close application\n" );
		}
	
	void Check_userInput() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Number");
		try {
         int input =scan.nextInt();	
		switch(input) {
		  case 1:
			  fo.get_listFiles();
			  
			  
		    // code block
		    break;
		  case 2:
			  fo.Advance_options();
			  
		    // code block
		    break;
		  case 3:
			  fo.closeApp();
		  default: 
			  fo.enter_again();
		}
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
			 fo.enter_again();
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		FilesManager fm = new FilesManager();
		fm.get_productInfo();
		fm.printoptions();
		fm.Check_userInput();
	
		
		
	

	}

}
