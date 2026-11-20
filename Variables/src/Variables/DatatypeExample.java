package Variables;

public class DatatypeExample {
	
	byte b = 42;
	byte b1;
	
	short s = 456;
	short s1;
	
	int i = 234567;
	int i1;
	
	long l = 453322553;
	long l1;
	
	float f = 45.56876549f;
	float f1;
	
	double d = 5332.5433;
	double d1;
	
	boolean flag = true;
	boolean check;
	
	char c = 'A';
	char c1;
	
	String str;
	
	public static void main(String[] args) {
		DatatypeExample dt = new DatatypeExample();
		
		System.out.println(dt.b);
		System.out.println(dt.b1);
		
		System.out.println(dt.s);
		System.out.println(dt.s1);
		
		System.out.println(dt.i);
		System.out.println(dt.i1);
		
		System.out.println(dt.l);
		System.out.println(dt.l1);
		
		System.out.println(dt.f);
		System.out.println(dt.f1);
		
		System.out.println(dt.flag);
		System.out.println(dt.check);
		
		System.out.println(dt.c);
		System.out.println("char by default:" + dt.c1);
		
		System.out.println(dt.str);
		
		
		
	}
}
