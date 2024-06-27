package methodOverriding;

public class RunTime {

	public static void main(String[] args) {
		AppleLaptop m1 = new MacBookPro();
		AppleLaptop m2 = new MacBookAir();
		
		m1.start();
		m1.shutdown();
		
		m2.start();
		m2.shutdown();
	}

}
