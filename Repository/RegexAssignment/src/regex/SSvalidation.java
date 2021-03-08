package regex;

import java.util.Scanner;

public class SSvalidation {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Social Security Number");
		String n =sc.nextLine();
		
		if(n.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}

	}


}
