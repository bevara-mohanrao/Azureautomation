package javaprogramming;
import java.util.ArrayList;


public class EvenAndOdd {

	public static void main(String[] args) {

     int num = 1234689;
		
	 int  even_count = 0;
	 int   odd_count = 0;
	 
	 while(num>0)
	 {
		int remind = num%10;
		  
		  if(remind%2 == 0)
		  {
			  even_count++; 
		  }
		  else if(remind%2!=0)
		  {
			  odd_count++;  
		  }
			 
		 num = num/10;
	
	 }
	 System.out.println("Total count of Even numbers  " +even_count);
	 System.out.println("Total count of Odd numbers  " +odd_count);
	   
	int a[] = {1,2,3,4,5,6,7,8};
	
	/* System.out.println("Even numbers in array ......");

	for(int i =0;i<a.length;i++)
	{
				
		if(a[i]%2 == 0)
		{
			 System.out.println(a[i]);
		}
	 
	
	}
	
	 System.out.println("Odd numbers in array ......");
		
	for(int i =0;i<a.length;i++)
	{
				
		if(a[i]%2 != 0)
		{
			 System.out.println(a[i]);
		}	
	} */
	
	 System.out.println("Even numbers in array ......");

	for(int value:a) {
		
		if(value%2==0)
		{
			System.out.println(value);
		}
	}
	
	 System.out.println("Odd numbers in array ......");

		for(int value:a) {
			
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}
	
	 
	}
	
	}


