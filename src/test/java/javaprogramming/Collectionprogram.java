package javaprogramming;
import java.util.HashMap;

public class Collectionprogram {

	public static void main(String[] args) {

		HashMap<String,Integer> subScores = new HashMap<String,Integer>();
		
		subScores.put("Egnlish", 80);
		subScores.put("Social", 75);
		subScores.put("Math", 85);
		subScores.put("Computers", 90);
		subScores.put("Science", 70);
		
		//subScores.putIfAbsent("Computers", 80);
		
		subScores.replace("Science", 99);
		
	//	subScores.remove("Egnlish");
		
		//subScores.clear();
		
	   // subScores.forEach(null);
		
		//System.out.println(subScores.get("Science"));
	// System.out.println(subScores.get(subScores));
		
		//System.out.println(subScores.containsValue(75));
		//System.out.println(subScores.containsKey("Computers"));
		
    	System.out.println(subScores.toString());
		
		//For Each subject 
		
    /*    subScores.forEach((subject,score) -> 
        System.out.println(subject + ":" + score)   
        );  */
		//
		System.out.println("Print marks after Corrections");
		
	 /*     subScores.forEach((subject,score) -> 
	      
	        subScores.replace(subject, score - 10)
	        ); 	 */
		System.out.println(subScores.toString());
        
        

        
		
		
	}

}
