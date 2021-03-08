package pack1;

import java.util.Scanner;

public class VowelCount {
	
	
public static void main(String[] args) {
	
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word, sentence or paragraph so the vowels can be counted");
		String n= sc.nextLine();		
		System.out.println(n.replaceAll("[^aeiouAEIOU]", "").length());

	}

}
