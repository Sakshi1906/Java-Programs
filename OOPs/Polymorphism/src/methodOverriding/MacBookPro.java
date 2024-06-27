package methodOverriding;

public class MacBookPro extends MacBook {
	@Override
	public void start() {
		System.out.println("Inside MackBookPro start");
	}

	@Override
	public void shutdown() {
		System.out.println("Inside MackBookPro shutdown");
	}
}
