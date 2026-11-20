package Variables;

public class Product {
	
	int pid = 34;
	String Pname = "Laptop";
	
	int phoneNo = 445649397;
	char division = 'A';
	
	public void ProductDetials() {
		int orderid = 345;
		String ordername = "Prasad Sonar";
		
		System.out.println(orderid);
		System.out.println(ordername);
	}
	
	public static void main(String[] args) {
		
		Product p = new Product();
		p.ProductDetials();
		
		System.out.println(p.pid);
		System.out.println(p.Pname);
		System.out.println(p.phoneNo);
		System.out.println(p.division);
	}

}
