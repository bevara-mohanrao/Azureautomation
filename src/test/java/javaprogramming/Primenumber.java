package javaprogramming;
import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
 
		  //Program for prime number
		System.out.println("Enter the number to check for PRIME");

		Scanner sc = new Scanner(System.in);
		
		int numb = sc.nextInt();
		
		//int numb = 17;
		
		int count = 0;
		
	 if(numb>1)
	 {
		 
		 for(int i=1;i<=numb;i++)
		 {
			if(numb%i == 0) 
				count++;
		 }
			
			
				if(count == 2)
				{
					System.out.println("This is an Prime Number");
					
				}
				else
				{
					System.out.println("This is an NOT an valid Prime Number");
				}
			
			 
		 
	 }
	 
	 else 
	 {
		 System.out.println("This is Not an Prime Number");
	 }
		
	 sc.close();
	}


}
