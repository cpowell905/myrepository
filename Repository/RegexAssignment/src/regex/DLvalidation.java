package regex;

import java.util.Scanner;

public class DLvalidation {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Drivers License Number");
		String n =sc.nextLine();
		
		if(n.matches("0000[0-9]{8}")) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}

	}

}
