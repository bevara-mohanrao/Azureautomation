package javaprogramming;
import java.util.HashMap;
import java.util.Map;
import java.lang.*;


public class CountduplicateCharInString {

	@SuppressWarnings({ "unlikely-arg-type", "unused" })
	public static void main(String[] args) {

		String str="programming";
		char[] arr=str.toCharArray();
		Map<Character, Integer> mapping=new HashMap<Character, Integer>();
				
		 Integer count=1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(!mapping.containsKey(arr[i]))
			{
				mapping.put(arr[i], mapping.get(arr[i]));
			}
			
			else
			{
				mapping.put(arr[i], mapping.get(arr[i]+1));
			}
				
		}
		
		for(Character key:mapping.keySet())
		{
			if(mapping.get(key)>1)
			{
				System.out.println("Count the duplicate characters " +mapping.get(key));
				
			}
				
		}
			
	
		
		
		
	}

}
