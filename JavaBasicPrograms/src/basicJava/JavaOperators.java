package basicJava;

public class JavaOperators {

	public static void main(String[] args) {
		// Unary operators : pre or post /increment or decrement
		int a = 10;

		System.out.println(a); // will print first 10 only
		System.out.println(a++); // post increment , will print first 10 only then value will be 11
		System.out.println(a); // will print first 11 only

		System.out.println("--------------------------------");

		System.out.println(a); // will print first 10 only
		System.out.println(++a); // pre increment , will print first 12 only then value will be 12
		System.out.println(a); //

		System.out.println("--------------------------------");

		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);

		System.out.println("--------------------------------");

		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);

		System.out.println("--------------------------------");

		System.out.println(a++ + a++);
		System.out.println(++a + ++a);
		System.out.println(a++ + ++a);
		System.out.println(++a + a++);

		System.out.println("--------------------------------");

		System.out.println(a-- + a--);
		System.out.println(--a + --a);
		System.out.println(a-- + --a);
		System.out.println(--a + a--);

		System.out.println("--------------------------------");
		// arithmetic operators : +,-,/,*,%
		int x = 10, y = 5;
		System.out.println(x + y);
		System.out.println(x / y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x % y);

		System.out.println("--------------------------------");

		// logical operators : &&

		System.out.println(x < y && x > y); // if first condition is true then controller will move to the next
											// condition
		System.out.println(x > y && x < y);

		System.out.println("--------------------------------");

		// bitwise operators : &
		System.out.println(x > y & x < y); // controller will check first condition if first condition either true or
											// false then controller will move to the next condition
		System.out.println(x < y & x > y);
		System.out.println("--------------------------------");

		// relational operators : >,<,<=,>=,==
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x >= y);
		System.out.println(x <= y);
		System.out.println(x == y);
		System.out.println(x != y);

		System.out.println("--------------------------------");

		// assignment operators: =
		int p = 20;
		System.out.println(p);
		p += 20;
		System.out.println(p);
		p -= 20;
		System.out.println(p);
		p *= 10;
		System.out.println(p);
		p /= 5;
		System.out.println(p);

	}

}
