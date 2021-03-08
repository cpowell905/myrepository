package pack1;

public class WrapperDouble {
	
public static void main(String[] args)	{
		
		Double i1=(double) 10;
		Double i2=(double) 10;
		Double i3=new Double(10);
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));
		
		System.out.println("(i1.equals(i2)) : "+(i1.equals(i2)));
		System.out.println("(i1.equals(i3)) : "+(i1.equals(i3)));
		
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		System.out.println(System.identityHashCode(i3));
		
		i2++;
		System.out.println(System.identityHashCode(i2));
		
		
		Double x=i2;
		System.out.println("x = "+x);
		x=(double) 7;
		i2=x; 
		System.out.println("i2 = "+i2);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		
		String s="123";
		double d=Double.parseDouble(s);
		System.out.println(d);
		
		
		Double f=i2.doubleValue();
		System.out.println("f = "+f);
		
		f= (double) 22.333f;
		double m=f.doubleValue();
		System.out.println("m = "+m);
		
		
		Integer x1=19;
		System.out.println(x1.compareTo(19)); 
		System.out.println(x1.compareTo(22)); 
		System.out.println(x1.compareTo(10)); 
					
	}

}
