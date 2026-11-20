package Variables;

public class LocalVariable {

	String name;
	
	void m1(int age) {
		System.out.println(age);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		LocalVariable l = new LocalVariable();
		l.name = "Jay";
		l.m1(21);
	}
}
