package javaprogramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


 
public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    String dupl[] = {"JAVA"	,"python","aem","language","python"};
    
    
    	for(int i=0;i<dupl.length;i++)	
    	{
    		for(int j=i+1;j<dupl.length;j++)
    		{
    			if(dupl[i].equals(dupl[j]))
    			{
    				System.out.println("Duplicate list values "+dupl[i]);
    			}
    		}
    	}

	  // Find the 2nd method using HashSet
    	
    Set<String> store = new HashSet<String>();
        for(String dup :dupl)
        	if(store.add(dup) == false)
        	{
        		System.out.println("Duplicate list values using Hashset "+dup);
        	}
        
  	  // Find the 3rd  method using HashMap

        Map<String, Integer> storeMap = new HashMap<String,Integer>();
        
        for(String hmdup: dupl)
        {
        	Integer count = storeMap.get(hmdup);
        	
            if(count == null)
            {
            	storeMap.put(hmdup,1);
            }
            else
            {
            	storeMap.put(hmdup, ++count);
            }
        	

            Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
            
            for(Entry<String, Integer> entry :entrySet)
            {
            	if(entry.getValue()>1)
            	{
            		System.out.println("Find duplicate string "+entry.getKey());
            	}
            }
            
            
        }
        
        
        }
				
		
		}
	

	

