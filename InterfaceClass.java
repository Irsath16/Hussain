package mypack;

interface Interface {
	void a();
	void b();
}

interface Interface1 extends Interface {
	void c();
	void d();
}


class Interface2 implements Interface1 {

	public void a() {
		System.out.println("I am A");
		
	}
	public void b() {
		System.out.println("I am B");
		
	}
	public void c() {
		System.out.println("I am C");
		
	}
	public void d() {
		System.out.println("I am D");
		
	}
}

public class InterfaceClass {
	public static void main(String[] args) {
		Interface1 Result = new Interface2();
		Result.a();
		Result.b();
		Result.c();
		Result.d();
	}
}