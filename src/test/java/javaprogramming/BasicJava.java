package javaprogramming;
import java.util.Scanner;

public class BasicJava {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 45;   //%d
		boolean iStudent = true;
		boolean ilibrarian = false;

        byte aByte = 120;  // - 128  to 127
        short aSmallnumber = 9090;   // small number
        long  aLargenumber = 9090324290L;	 //Large number
        int aInteger = 9093;   //Integer number
        	
        double aDouble = 1.298; //Decimal point number for short
        float aFloat =  3.5223F; // Long Decimal number 
        
        boolean aBoolean = true ;
        boolean aBoolean2 = false;
        
        System.out.println("Print value of Byte" + aByte);
        System.out.println("Print value of short  " + aSmallnumber);
        System.out.println("Print value of long " + aLargenumber);
        System.out.println("Print value of Integer" + aInteger);
        System.out.println("Print value of double " + aDouble);
        System.out.println("Print value of float " + aFloat);
        System.out.println("Print value of boolean true " + aBoolean);
        System.out.println("Print value of boolean false " + aBoolean2);

        //Arithmetic operations :  + , - , * , /(modulo)
        
        double numb1  = 15;
		double numb2  =  8;
		
        System.out.println(numb1 + numb2);
        System.out.println(numb1 - numb2);
        System.out.println(numb1 * numb2);
        System.out.println(numb1 / numb2);
        
        //Logical operator  - == (equal), != (not equal) , > , < , >= , <= operators  and mainly &&(and) ,|| (or) and finally !statement (not operator)
        System.out.println(age >=20 && age<=20);
        System.out.println(iStudent || ilibrarian);
        
       // Best method way to use modulo
        
       String name = "Mohan Rao";  //%s
       String lang = "Java Programming";  //%s
       double gpa = 4.2;  //%f
       
       String name1 = new String("MOHAN RAO");
       String name2 = new String("MOHAN RAO");
       String name3 = new String("mohan RAO");

       String formattedstring =  String.format("My name is %s I am learming today %s and my age is %d.My GPA is %f ", name,lang,age,gpa);
    		  
       System.out.println(formattedstring);
       
       System.out.println(lang.length());
       System.out.println(lang.toLowerCase());
       System.out.println(lang.toUpperCase());

      System.out.println(name1.equals(name2));
      System.out.println(name1.equalsIgnoreCase(name3));

      Scanner mscanner = new Scanner(System.in);
      
        System.out.print("What is your name ");
        String printname = mscanner.nextLine();
        
        System.out.printf("Hello my name is %s",printname);

        System.out.println("Please enter your age for eligibility check");
        
          int eligibleage = 48;

        int printage = Integer.parseInt(mscanner.nextLine());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        
        if ( printage <= eligibleage )
        {
        
        System.out.printf("Good News Your age is %d qualify for Canada immigration PR",printage);
        }
        
        else 
        {        System.out.printf("Sorry Your age is %d NOT qualify for Canada immigration PR",printage);

        }

        mscanner.close();
         
        

        

        
        	
		
	}
	


}
