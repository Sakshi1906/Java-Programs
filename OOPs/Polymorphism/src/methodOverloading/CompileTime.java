package methodOverloading;

public class CompileTime {
	
	void add(int a, int b){
		int result = a+b;
		System.out.println("Sum is: "+result);
	}
	
	void add(float a, float b) {
		float result = a+b;
		System.out.println("Sum is: "+result);
	}
	
	void add(int a, int b, int c) {
		int result = a+b+c;
		System.out.println("Sum is: "+result);
	}

	public static void main(String[] args) {
		CompileTime ct = new CompileTime();
		ct.add(10, 20);
		ct.add(30.2f, 20.5f);
		ct.add(10, 20, 30);
		
	}

}
