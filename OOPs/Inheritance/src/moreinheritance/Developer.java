package moreinheritance;

public class Developer extends Employees {
	String technology;

	public Developer(int id, String name, String dept, double salary, String technology) {
		super(id, name, dept, salary);
		this.technology = technology;
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("Developer is working on " +technology);
	}
}
