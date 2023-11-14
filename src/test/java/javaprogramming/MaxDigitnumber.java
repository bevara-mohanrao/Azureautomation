package javaprogramming;

import java.util.Scanner;

public class MaxDigitnumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number1 ");
		
		Scanner sc1 = new Scanner(System.in);
		
		int num1  = sc1.nextInt();
		
	System.out.println("Enter the Number1 ");
		
		Scanner sc2 = new Scanner(System.in);
		
		int num2  = sc2.nextInt();
		
	System.out.println("Enter the Number2 ");
		
		Scanner sc3 = new Scanner(System.in);
		
		int num3  = sc3.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("Greatest number is "+num1);
				
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Greatest number is "+num2);
				
		}	
		else if(num3>num1 && num3>num1)
		{
			System.out.println("Greatest number is "+num3);
				
		}
		
		sc1.close();
		sc2.close();
		sc3.close();
				
 
//Method 2 without using if else logic.
	
int largest1 = num1>num2?num1:num2;

int large =largest1>num3?largest1:num3;

System.out.println("Greatest number from 3 numbers is "+large);


	}

}
