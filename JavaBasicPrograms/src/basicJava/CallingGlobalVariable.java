package basicJava;

public class CallingGlobalVariable {
	int x = 10; // global variable
	int b = 20; // global variable
	static int c = 30; // static variable

	public void methodTest1() { // non static method
		System.out.println("MethodTesting1");
	}

	public static void methodTest2() { // static method
		System.out.println("MethodTesting2");
	}

	public static void main(String[] args) {

		System.out.println(c); // calling static variable
		System.out.println(CallingGlobalVariable.c); // //calling static variable using class name

		CallingGlobalVariable cgv = new CallingGlobalVariable();// object reference of a class

		System.out.println(cgv.x); // calling global variable inside the main method
		System.out.println(cgv.b); // calling global variable inside the main method

		System.out.println("-------------------------------");

		cgv.methodTest1(); // calling non-static method inside the main method with object reference.
		methodTest2(); // calling static method inside the main method directly or without object
						// reference.
	}
}
