package pack1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n= sc.nextInt();
		System.out.println("Enter "+n +" elements");
		int ar[]=new int[n];
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
		
		}
		System.out.println(findSum(ar));
		
		}
		public static int findSum(int array[]) {
			int sum = 0;
			for (int value : array)	{
				sum += value;
			}
			return sum;

	}

}
