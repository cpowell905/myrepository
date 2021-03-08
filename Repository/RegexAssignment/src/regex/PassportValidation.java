package regex;

import java.util.Scanner;

public class PassportValidation {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter passport number");
		String n =sc.nextLine();
		
		if(n.matches("[0-9]{9}")) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}

	}
	

}
