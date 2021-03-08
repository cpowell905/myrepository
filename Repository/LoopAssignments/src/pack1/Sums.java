package pack1;

public class Sums {
	
	public static void main(String[] args) {
		
		int x=0;
		for (int q= 1; q <=100; q++) {
			 if(q%2==0) {
				x = x+q;
			 }
		}
		System.out.println(x);
		
		int o=0;
		for (int q= 1; q <=100; q++) {
			 if(q%2!=0) {
				o = o+q;
			 }
		}
		System.out.println(o);
		
		if(o>x) {
			System.out.println(o+" is the larger number");
		}
		else if(o<x) {
			System.out.println(x+" is the larger number");
		}
	}

}
