package javaprogramming;

public class CountofDigits {

	public static void main(String[] args) {
		// Count of Digits
		
		int numb1 = 139029235;
		
	    int count = 0;
	    
	    while(numb1 >0)
	    {
	    	numb1 = numb1/10;
	    	count++;
	    }
	    System.out.println("Total number of digits count " +count);

	}

}
