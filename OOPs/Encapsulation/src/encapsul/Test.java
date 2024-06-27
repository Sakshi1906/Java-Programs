package encapsul;

public class Test {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.setFirstName("Sakshi");
		c.setLastName("Choudhary");
		c.setCreditCard("12345");
		
		System.out.println("First name: "+c.getFirstName());
		System.out.println("Last name: "+c.getLastName());
		System.out.println("Credit card: "+c.getCreditCard());
	}

}
