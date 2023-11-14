package javaprogramming;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {

	 /* int a[] = {10,25,30,40,55};
	  int srch_element = 10;
	  boolean flag=false;
	  
	  for(int i=0;i<a.length;i++)
	  {
		  if(srch_element == a[i])
		  {
			  System.out.println("Search element is Found  "+i);
			  flag= true;
		  }
		  
	  }
	  if(flag == false)
	  {
	  System.out.println("Search element not found ");
	  }  
	  
	  */
	  String str[] = {"java","python","cucumber","eclipse"};
	  
	  
	  //String str_comp= "python";
	  System.out.println("Enter the String to Search ");
	  Scanner  str1 = new Scanner(System.in);
	  String str_comp = str1.next();
	     
	  
	  boolean flag1 = false;
	  
	  for(int i=0;i<str.length;i++)
	  {
		  if(str_comp.equals(str[i]))
		  {
			  System.out.println("Search string is found in place "+i);
			  flag1= true;
		  }	  
	  }
	  if(flag1== false)
	 {
		  System.out.println("Search string is not found. Please try again ");
	  }
		
	}
	
}
