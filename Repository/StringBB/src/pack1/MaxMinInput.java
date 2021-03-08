package pack1;

import java.util.Scanner;

public class MaxMinInput {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String n =sc.nextLine();
		String ar[]=n.split(" ");
		String max = ar[0];
		String min = ar[0];
		
		for (int i = 0;  i < ar.length; i++) {
			int q = ar[i].length();
			if (max.length() < q) {
				max = ar[i];				
			}
			
			if (min.length() > q) {
				min = ar[i];
			}
			
		}
		System.out.println("Largest word: " + max
				+ "\nSmallest Word: " + min);

	}

}
