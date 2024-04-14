package edu.staticAndnonstaticmethod;

public class Test1 {
	//Non-static return value method
	public int add() {
		int a = 10, b = 20;
		
		//call static method in non-static method
		int h = sub();
		int res = a+b+h;
		return res;
	}
	//non-static without return value
	public void add2() {
		int a = 15, b = 45;
		System.out.println(a+b);
	}
	//static method with return value
	public static int sub() {
		int a = 60, b =40;
		int c = a-b;
		return c;
	}
	//static method without return value
	public static void sub2() {
		int a = 70, b = 20;
		System.out.println(a-b);
		//call static method in another static method
		int g = sub();
		System.out.println(a-b-g);
	}

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		int d = t1.add();
		System.out.println(d);//30 
		t1.add2();//60
		System.out.println(sub());//20
		sub2();//50
		
	}

}
