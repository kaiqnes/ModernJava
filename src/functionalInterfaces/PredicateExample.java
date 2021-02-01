package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> isDivisibleByTwo_full = (i) -> { return i % 2 == 0; };
	static Predicate<Integer> isDivisibleByTwo = (i) -> i % 2 == 0;
	static Predicate<Integer> isDivisibleByFive = (i) -> i % 5 == 0;
	
	static int a = 8, b = 10, c = 11;
	
	public static void main(String[] args) {
		predicateSimple();
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

	private static void predicateNegate() {
		System.out.println("predicateNegate :");
		System.out.printf("is %d NOT divisible by TWO AND NOT divisible by FIVE: %b\n", a, isDivisibleByTwo.and(isDivisibleByFive).negate().test(a));
		System.out.printf("is %d NOT divisible by TWO AND NOT divisible by FIVE: %b\n", b, isDivisibleByTwo.and(isDivisibleByFive).negate().test(b));
	}

	private static void predicateOr() {
		System.out.println("predicateOr :");
		System.out.printf("is %d divisible by TWO OR divisible by FIVE: %b\n", a, isDivisibleByTwo.or(isDivisibleByFive).test(a));
		System.out.printf("is %d divisible by TWO OR divisible by FIVE: %b\n", b, isDivisibleByTwo.or(isDivisibleByFive).test(b));
	}

	private static void predicateAnd() {
		System.out.println("predicateAnd :");
		System.out.printf("is %d divisible by TWO AND divisible by FIVE: %b\n", a, isDivisibleByTwo.and(isDivisibleByFive).test(a));
		System.out.printf("is %d divisible by TWO AND divisible by FIVE: %b\n", b, isDivisibleByTwo.and(isDivisibleByFive).test(b));
	}

	private static void predicateSimple() {
		System.out.println("predicateSimple :");
		System.out.printf("is %d divisible by TWO: %b\n", a, isDivisibleByTwo_full.test(a));
		System.out.printf("is %d divisible by TWO: %b\n", c, isDivisibleByTwo.test(c));
		System.out.printf("is %d divisible by FIVE: %b\n", b, isDivisibleByFive.test(b));
	}

}
