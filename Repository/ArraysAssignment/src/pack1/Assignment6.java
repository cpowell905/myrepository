package pack1;

public class Assignment6 {
	
	
public static void main(String[] args) {
		
		int ar[]=new int[6];
		ar[0]=5;
		ar[1]=10;
		ar[2]=15;
		ar[3]=20;
		int n=4;
		System.out.println("Before Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		int insertion=25;
		int pos=5;
		for(int i=n;i>pos-1;i--) {
			ar[i]=ar[i-1];
		}
		ar[pos-1]=insertion;
		n++;
		
		System.out.println("\n\nAfter Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		int delpos=2;
		for (int i = delpos-1; i < n; i++) {
			ar[i]=ar[i+1];
		}
		n--;
		System.out.println("\n\nAfter Deletion from positon "+delpos);
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
	}
	
	

}
