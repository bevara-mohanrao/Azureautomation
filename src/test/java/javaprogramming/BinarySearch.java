package javaprogramming;

public class BinarySearch {

	public static void main(String[] args) {
		// Binary search program
		
		int arr[] = {10,20,30,40,50,60,70,80};
		int key = 20;
		int lower = 0;
		int upper = arr.length-1;
		boolean flag=false;

	  while(lower<=upper)
	  {
		  
		 int mid = (lower + upper)/2;
		 
		 if(arr[mid]==key)
		 {
			 System.out.println("Binary search element found " +key);
			 flag=true;
			 break;
		 }
		 
		 if(arr[mid]<key)
		 {
           lower = mid+1;
		 }
		 
		 if(arr[mid]>key)
		 {
			upper = mid-1; 
		 }
	  }
		
	  if(flag== false)
	  {
		  System.out.println("Binary search element not found");
	  }
		

	}

}
