package javaprogramming;

public class Stringmanupliationpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi Mohan Practice Java programming language";
		
       System.out.println(str.length());	
       
       System.out.println(str.charAt(9));
       
       String str1 = "hi mohan practice java programming language";
       
       //System.out.println(str.compareToIgnoreCase(str1));
       System.out.println(str.equalsIgnoreCase(str1));
       
       System.out.println(str.indexOf("a"));
       System.out.println(str.indexOf("a",(str.indexOf("a")+1)));
       
       System.out.println(str.substring(3,35));
       
       String st = "  Hello Mohan Practice More  ";
       System.out.println(st.trim());
       System.out.println(st.replace(" ", ""));
       
       String date = "10-09-2023";
       
       System.out.println(date.replace("-", "/"));
       
       
       String st_test = "Hello_Mohan_Practice_More";
       
       String split[] =  st_test.split("_");
       
       for(int i=0;i<split.length;i++)
       {
    	   System.out.println(split[i]);
    	      
       }
       
      String str11 = "Mohan";
      System.out.println(str11.concat("rao"));
      
      String a = "Mohan rao";
      String b = "Bevara";
      int c = 150;
      int d = 220;
      System.out.println(a+b+c+d);
      System.out.println(a+" " +b+ " "+(c+d));
   
	}

}
