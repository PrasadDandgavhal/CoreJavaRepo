package Variables;

public class Employee {
	int id = 23;
	String Name = "Prasad";
	
	Employee() {
		int companyId = 12;
		String companyName = "EY";
		
		System.out.println("Company ID:" + companyId);
		System.out.println("Company Name: " + companyName);
	}
	
	public void employeeDetails() {
		System.out.println("Employee ID:" + id);
		System.out.println("Employee Name: "+ Name);
	}
	
	public void employeeSalary() {
		int salary = 10000;
		System.out.println(salary);
	}
}
