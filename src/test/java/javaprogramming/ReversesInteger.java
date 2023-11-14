package javaprogramming;

public class ReversesInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		long numb = 1236789;
		long rever = 0;
		
		while(numb!=0)
		{
			rever = rever * 10 + numb %10;
			numb = numb / 10;
		}
		
		System.out.println("reverse string value "+rever);
		
		long numb1 = 2456789;
		System.out.println("reverse string value for SB function "+new StringBuffer(String.valueOf(numb1)).reverse());
		
		// Swap the integers methods
		
		   int i = 12;
		   int j = 8;
		
		/*
		   int k;
		   k= i;
		   i=j;
		   j=k; */
		   
		/* i= i+j;
		 j= i-j; //12
		 i= i-j; //8  */
		 
		/* i = i * j;
		 j = i/j;  
		 i = i/j; */
		 
		 i = i^j;  // 1111  decimal to binary format
		 j = i^j;  // 1010
		 i = i^j;  // 0101
   
		   System.out.println("print i value: "+i);
		   System.out.println("print j vaue: "+j);
		   
	}
	
	
	
}
