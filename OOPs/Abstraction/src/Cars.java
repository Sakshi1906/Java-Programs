
public abstract class Cars {
	void common() {
		System.out.println("Inside common");
	}

	public abstract void run();

	public static void main(String[] args) {
		System.out.println("Inside main");

	}
}

class Audi extends Cars {
	@Override
	public void run() {
		System.out.println("Inside Audi");
	}
}

class mercedes extends Cars {
	@Override
	public void run() {
		System.out.println("Inside mercedes");
	}
}
