package pack1;

import java.util.Scanner;

public class LastCharUp {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String n =sc.nextLine();
		
		String ar[]=n.split(" ");
		
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			int q = ar[i].length()-1;
			sb.append(ar[i].substring(0, q)).append(Character.toUpperCase(ar[i].charAt(q))).append(" ");
		}
		System.out.println(sb.toString().trim());

	}

}
