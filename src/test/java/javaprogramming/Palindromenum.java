package javaprogramming;
import java.util.Scanner;

public class Palindromenum {

	public static void main(String[] args) {
		// Check for Palindrome number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the reverse number");
		
		int num = sc.nextInt();
		
		int pailinnum = num;
		
	    int revnum = 0;
	    
	    while(num!=0) {
	    	
	    	revnum = revnum * 10 + num%10;
	    	num = num / 10;
	    }
	    
	  //  System.out.println("Reverse print number " +revnum);
	    
	   if(pailinnum == revnum) 
	   {
		   System.out.println(+pailinnum+ "  This is Palindrom and you are success for Programming");
	   }
	   else
	   {
		   System.out.println("This is not an Palindrome number");

	   }
	   
	   
	  // String  str1 = "iTopiNonAvevanoNipoti";
	   
	   System.out.println( "Enter the palin string");

	    String str1 = sc.next();
	    
		   String palinstr = str1;

	   //System.out.println(str1);

	   String revstr ="";
	   
	   
	   for(int i=str1.length()-1;i>=0;i--)
	   {
		   revstr = revstr + str1.charAt(i);
	   }
	   System.out.println(revstr);

	   
	   if(palinstr.equals(revstr))
	   {
		   System.out.println(palinstr+ "    This is Palindrom string and Good Job for programming");
	   }
	   else 
	   {
		   System.out.println( "This is not aPalindrom string.. Please enter palin string ");

	   }
	  sc.close(); 
	    
		
	}

	
}
