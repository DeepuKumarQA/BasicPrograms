package basicJava;

public class ArrayPrograms {

	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 5, 6, 8, 3, 9, 2 }; // integer array
		String s[] = { "Test1", "Test2", "Test", "Test6", "Test7" }; // string array
		int b[] = new int[5]; // array instantiation
		b[0] = 2; // assigning the value to the array
		b[1] = 23;
		b[2] = 321;

		for (int prnt : b) {
			System.out.println(prnt);
		}
		b[4] = 423435;
		System.out.println(b[4]);
		System.out.println(b.length);// printing the length of the array
		System.out.println("----------------------------------");

		System.out.println(a[3]); // printing integer array value at index 3
		System.out.println(s[3]); // printing string array value at index 3

		for (int s1 : a) { // using for each loop , traversing all array values
			System.out.println(s1);
		}
		System.out.println("----------------------------------");
		for (String s2 : s) {
			System.out.println(s2);
		}
		System.out.println("----------------------------------");

		Object obj[] = { 3, 89, 43, "test4456", "3434test", "9847test2324" };
		System.out.println(obj[3]); // printing string array value at index 3

		System.out.println("----------------------------------");
		System.out.println("PassingArrayInsideTheMethod");

		System.out.println("---------------Array Methods-------------------");
		System.out.println(obj.length); // printing the length of the onj array
		// checking array equals method
		// checking array sort method
		// checking array binarysearch method

	}
}
