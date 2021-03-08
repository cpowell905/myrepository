package pack1;



public class Palindromes {

	public static void main(String[] args) {
		
		System.out.println("all palindrome numbers 100 to 999");
		for ( int i=100; i < 1000; i++) {
			isPalindrome(i);
		}
		

	}
	public static void isPalindrome(int n) {
		
		int c = (n - (n%100))/100;
		int t = (n%10);
		if( n< 100 || n> 999) {
			System.out.println("");
		}
		else if(n>= 100 && n <= 999 && (c==t))	{
			System.out.println(n);
		}
		
		
	}
	

}
