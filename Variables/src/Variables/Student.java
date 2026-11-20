package Variables;

public class Student {
	 
	int id = 12;
	String name = "Prasad";
	
	public void StudentDetails() {
		int marks = 50;
		String collegeName = "DY Patil";
		
		System.out.println("Marks: "+ marks);
		System.out.println("College Name:" + collegeName);
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		std.StudentDetails();
		
		System.out.println(std.id);
		System.out.println(std.name);
	}
	
}
