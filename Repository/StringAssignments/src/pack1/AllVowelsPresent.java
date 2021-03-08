package pack1;

import java.util.Scanner;

public class AllVowelsPresent {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word, sentence or paragraph so the vowels can be counted");
		String n= sc.nextLine();
		boolean hasAll = true;
		for(int i = 0; i < 5; i++) {
			char c1 = "aeiou".charAt(i);
			char c2 = "AEIOU".charAt(i);
			if(!(n.contains(c1 + "") || n.contains(c2 + "")) ) {
				hasAll = false;
				break;
			}
		}
		System.out.println(hasAll);

	}

}
