package moreinheritance;

public class Employees {
	
	int id;
	String name;
	String dept;
	double salary;
	
	public Employees(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		System.out.println("Inside employee constructor");
	}
	
	protected void work() {
		System.out.println("Common work for everyone");
	}

}
