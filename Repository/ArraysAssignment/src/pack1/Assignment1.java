package pack1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n= sc.nextInt();
		System.out.println("Enter "+n +" elements");
		int ar[]=new int[n];
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Array's prime numbers");
		
		for (int i = 0; i < ar.length; i++) {
            boolean isPrime = true;
            if (ar[i] == 1)
                isPrime = false;
            else {      
                for (int j = 2; j <= ar[i] / 2; j++) {
                    if (ar[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime)
                System.out.println(ar[i]);
        }
		
		
	}
	
	

}
