package javaprogramming;

public class MinandMaxvalue {

	public static void main(String[] args) {
   
		int a[] = {20,50,30,45,70,85};
	     int max = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Print the max value  " + max);  
		
		int min = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Print the min value  " + min);

		
	}

}
