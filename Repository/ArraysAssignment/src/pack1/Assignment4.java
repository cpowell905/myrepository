package pack1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n= sc.nextInt();
		System.out.println("Enter "+n +" elements");
		int ar[]=new int[n];
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
		
		}
		
		System.out.println(getMax(ar)+" is the max");
		System.out.println(getMin(ar)+" is the min");
		
		

	}
	public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  // Method for getting the minimum value
	  public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  }

}
