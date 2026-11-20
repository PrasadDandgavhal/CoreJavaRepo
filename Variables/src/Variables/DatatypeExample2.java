package Variables;

public class DatatypeExample2 {

	//global variable
	byte rollNo = 23;
	short s = 345;
	int i = 34535332;
	long l = 354999292;
	
	float f = 45.45f;
	double d = 45643.3445;
	
	public void displayValue() {
		int num1 = 344;
		System.out.println(num1);
	}
	
	
	public static void main(String[] args) {
		DatatypeExample2 dt = new DatatypeExample2();
		dt.displayValue();
		System.out.println(dt.rollNo);
		System.out.println(dt.i);
		System.out.println(dt.s);
		System.out.println(dt.l);
		System.out.println(dt.f);
		System.out.println(dt.d);
	}
}
