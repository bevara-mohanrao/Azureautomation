package javaprogramming;

public class CountCharInstring {

	public static void main(String[] args) {

		String str = "I am learning and doing doing doing doing java programing code";
		
		int result = str.length()-str.replaceAll("o", "").length();
		
		System.out.println("Lengh of the string " +result);
		
	
	}

}
