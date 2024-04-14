package polymorphysm;

public class MethodOverLoading {
	
	
	public static void main() {
		int a=20;
		System.out.println(a);
		
		
	}
	
	public  void main(int b) {//non-static method
		
	System.out.println(b);
	
		
	}
	public  void  main(String name) {
			System.out.println(name);
	}

	public static void main(String[] args) {
		MethodOverLoading ml = new MethodOverLoading();
		
		ml.main(10);
		ml.main("Rama");
		main();

	}

}
