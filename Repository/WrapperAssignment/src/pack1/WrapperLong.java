package pack1;

public class WrapperLong {
	
public static void main(String[] args)	{
		
		Long i1=(long) 10;
		Long i2=(long) 10;
		Long i3=new Long(10);
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));
		
		System.out.println("(i1.equals(i2)) : "+(i1.equals(i2)));
		System.out.println("(i1.equals(i3)) : "+(i1.equals(i3)));
		
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		System.out.println(System.identityHashCode(i3));
		
		i2++;
		System.out.println(System.identityHashCode(i2));
		
		
		Long x=i2;
		System.out.println("x = "+x);
		x=(long) 7;
		i2=x; 
		System.out.println("i2 = "+i2);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
		String s="123";
		long d=Long.parseLong(s);
		System.out.println(d);
		
		
		Long f=i2.longValue();
		System.out.println("f = "+f);
		
		f=(long) 22.333f;
		long m=f.longValue();
		System.out.println("m = "+m);
		
		
		Integer x1=19;
		System.out.println(x1.compareTo(19)); 
		System.out.println(x1.compareTo(22));
		System.out.println(x1.compareTo(10));
					
	}

}
