package pack1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter size of array");
			int n= sc.nextInt();
			System.out.println("Enter "+n +" elements");
			int ar[]=new int[n];
			for (int i = 0; i < n; i++) {
				ar[i]=sc.nextInt();
			
			}
			isPalindrome(ar);
			
			
			}	
			public static void isPalindrome(int n[])
			{
		        for (int i=0; i<n.length; i++) {
		        	int temp = 0, reverse = 0, newI = n[i];
		        	while(newI>0)	{
		        		temp = newI%10;
		        		reverse = reverse * 10 + temp;
		        		newI = newI/10;
		        	}
		        	if (n[i] == reverse){
		                System.out.println(n[i]+" is a palindrome");
		                
		            }
		    }
	}

}
