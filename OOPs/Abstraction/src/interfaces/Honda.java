package interfaces;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("Inside honda go");
	}

	@Override
	public void stop() {
		System.out.println("Inside honda stop");
	}

	public static void main(String[] args) {
		Honda h = new Honda();
		h.go();
		h.stop();
	}
}
