package pack1;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter size of array");
			int n= sc.nextInt();
			System.out.println("Enter "+n +" elements");
			int ar[]=new int[n];
			for (int i = 0; i < n; i++) {
				ar[i]=sc.nextInt();
			}
			
			
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int max2 = Integer.MIN_VALUE;
			for (int i = 0; i < ar.length; i++) {
				
				if (ar[i] > max) {
					max2 = max;
					max = ar[i];
				}
				if (ar[i] < max && ar[i] > max2) {
					max2 = ar[i];
				}
				if (ar[i] < min) {
					min = ar[i];
				}
				
			}
				
			System.out.println("The second largest number in the array is "+max2);

	}	

}
