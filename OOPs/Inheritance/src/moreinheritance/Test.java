package moreinheritance;

public class Test {

	public static void main(String[] args) {
		String[] projects = new String[] {"Flight Reservation"};
		Manager manager = new Manager(1, "John", "Travel", 10000, projects);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();
	}

}
