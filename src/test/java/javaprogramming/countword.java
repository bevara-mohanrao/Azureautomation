package javaprogramming;
import java.util.HashMap;
import java.util.Map;

public class countword {

	public static void main(String[] args) {

      String Str ="I am joining joinig java java programming";
      
        Map<String,Integer> map = new HashMap<String,Integer>();
        int count = 1; 
        String[] arr=Str.split(" ");
        
          for(int i=0;i<arr.length;i++)
          {
        	if(!map.containsKey(arr[i]))
        	{
        		map.put(arr[i], count);
        	}
        	else
        	{
        		map.put(arr[i], map.get(arr[i]+1));
        		
        	}        	  
        	  
          }
           for (String x: map.keySet())
           {
        	   System.out.println("The Count of words : " +x+ +map.get(x));
           }
        	   
          
	}

}
