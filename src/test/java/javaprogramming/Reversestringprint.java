package javaprogramming;
import java.io.*;
import java.util.*;

public class Reversestringprint {
	public static void main(String[] args) {
			
	//Method 1 using direct reverse method 
    String str = "THIS IS JAVA PROGRAMMING PRACTICE BY MOHAN 1ST METHOD";
	
		
		/*StringBuffer sb = new StringBuffer(str);
		  sb.reverse();
		 System.out.println("Print the reverse string :  " +sb); */
		 
	//Method 2 using for loop of rever string.
		
		String revstr = "";
		
		 for(int i=str.length()-1;i>=0;i--) {
			 revstr = revstr + str.charAt(i); }
		 
		 
		 System.out.println("Print the reverse string :  " +revstr);  
		
		
			String str1 = "THIS IS JAVA PROGRAMMING PRACTICE BY MOHAN 2ND METHOD";

    //Method 3 using array with for loop
		 
		 char a[] = str1.toCharArray();
		 
			String revstr1 = "";

		for(int i = a.length-1;i>=0;i--)
		{
			
		   revstr1 = revstr1 + a[i];
		}
		 
		 System.out.println("Print the reverse string:  " +revstr1);

		
		//How to avoid junk/ special characters. Regular expression
		 
		 String junkstr = "#@#%@@@%@# Print alphabets and numbers #$$##@#@$";
		 
		   System.out.println(junkstr.replaceAll("[^a-zA-Z0-9]", ""));
			
		 
		 
		 
	}
}
