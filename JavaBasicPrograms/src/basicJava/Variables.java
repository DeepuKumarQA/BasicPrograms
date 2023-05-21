package basicJava;

public class Variables {
	int x; // global variables and this is variable declaration
	int y; // global/class level variables
	static int z;
	
	public static void methodCheck() { // this is static method 
		System.out.println("This is method");
	}

	public static void main(String[] args) {
		int a = 10; // this is local variable and this is variable definition or intialization
		int b = 20;

		System.out.println(a);
		System.out.println(b);
		System.out.println(z);
		// this is variable calling and this is also called static variable will print
								// default value of the variable
		methodCheck(); // static method calling inside the main method 
	}

}
