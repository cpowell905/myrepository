package pack1;

import java.io.PrintStream;
import java.util.Scanner;

public class UpOddMidUpEvenFirst {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String n =sc.nextLine();		
		String ar[]=n.split(" ");
		
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			int s = ar[i].length();
			if(!(s % 2 == 0)) {
				sb.append(ar[i].substring(0, s/2)).append(Character.toUpperCase(ar[i].charAt(s/2)))
				.append(ar[i].substring(s/2+1, s)).append(" ");
			}
			else {
				sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
			}
		}
		System.out.println(sb.toString().trim());

	}

	private static PrintStream substring(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
