package javaprogramming;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderprog {

	public static void main(String[] args) throws IOException {
    
		FileReader filer = new FileReader("D:\\TestAutomation\\AutomationIntegration\\Mohanfile.txt");
		BufferedReader buffr = new BufferedReader(filer);
		
		String strval; 
		
		while((strval=buffr.readLine()) != null)
		{
			System.out.println(strval);
		}
	buffr.close();
	
	File filename = new File("D:\\TestAutomation\\AutomationIntegration\\Mohanfile.txt");
	Scanner scr = new Scanner(filename);
	
	while(scr.hasNextLine()) 
	{
       System.out.println(scr.nextLine());	
      }
	
	
	}

}
