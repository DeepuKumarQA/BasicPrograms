package basicJava;

public class VariableMethodCalling {
	int x = 11;
	int y = 22;

	public static void methodTest() {
		System.out.println("Method Testing");
	}

	public static void main(String[] args) {
        // variable calling 
		int a = 10, b = 20;
		System.out.println(a + " and " + b); // this is variable calling
		System.out.println("--------------------------------------");
		methodTest(); // this is method calling inside the main method
	}
}