package pack1;

import java.util.Scanner;

public class PrimeIndex {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word, sentence or paragraph so the prime indexes can be capitalized");
		String n= sc.nextLine();		
		String b[] = n.split("");
		for(int i = 0; i< n.length(); i++)	{
			if(isPrime(i)) {
				System.out.println(b[i].toUpperCase());
			}
		}
		

	}	
	public static boolean isPrime(int p) {
		boolean c = true;
		if(p ==0 || p == 1 || p == 2) {
			return true;
		}
		for (int i = 2; i <=p / 2; i++) {
			if (p % i == 0) {
				c = false;
				break;
			}
			
		}
		return c;
	}


}
