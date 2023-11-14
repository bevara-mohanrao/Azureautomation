package javaprogramming;
import java.util.HashSet;

public class FindDupString {

	public static void main(String[] args) {

	/*	String arr[] = {"python","java","maven","java","selenium","python"};
		
	boolean	flag = false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					
				System.out.println("Found the Duplicate string " +arr[i]);
				flag = true;
				}
			}
				
		}
		if(flag==false)
		{
			System.out.println("Not found any Duplicate string");
		}
		
		*/
	
	String arr[] = {"python","java","maven","java","selenium","python"};
	boolean	flag = false;

		HashSet <String>lang = new HashSet();
		
		for(String langs:arr)
		{
			if(lang.add(langs)== false)
			{
				System.out.println("Found the Duplicate string " +langs);
                flag = true;
			}
		}
		if(flag== false)
		{
			System.out.println("Not found any Duplicate string");
		}
			
	}

}
