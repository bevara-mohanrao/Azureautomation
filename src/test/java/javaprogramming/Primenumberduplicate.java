package javaprogramming;

import java.util.Scanner;

public class Primenumberduplicate {

	public static void main(String[] args) {

		System.out.println("Enter the number you want to test for PRIME");
		
	Scanner sc = new Scanner(System.in);
	
int number1= sc.nextInt();
		
		//int number1 = 786;
		int count = 0;
		
	    if(number1 >1)
	    {
	    
	     for(int i =1;i<=number1;i++)
	     {
	    	 if(number1%i == 0)
	    		 count++;
	     }
	     
	    		 if(count == 2)
	    		 {
	    			 System.out.println("This is an PRIME NUMBER");
	    		 }
	    	 
	    		 else
	    		 {
	    			 System.out.println("This is not an PRIME NUMBER");
	    		 }
	    	 
	    	
	     }
	    
	    
	    else
	    {
	    	System.out.println("This is not an Prime number");
	    }
	    sc.close();
	}

}
