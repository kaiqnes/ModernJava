package functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class PredicateExample {

	static Predicate<Integer> isDivisibleByTwo_full = (i) -> { return i % 2 == 0; };
	static Predicate<Integer> isDivisibleByTwo = (i) -> i % 2 == 0;
	static Predicate<Integer> isDivisibleByFive = (i) -> i % 5 == 0;
	
	static Predicate<Student> filterByGender_male = (student) -> student.getGender().equalsIgnoreCase("male");
	static Predicate<Student> filterByGradeLevel = (student) -> student.getGradeLevel() >= 3;
	static Predicate<Student> filterByGpa = (student) -> student.getGpa() >= 3.9;
	
	static List<Student> studentList = StudentDataBase.getAllStudents();
	static int a = 8, b = 10, c = 11;
	
	public static void main(String[] args) {
		// predicateSimple();
		// predicateAnd();
		// predicateOr();
		// predicateNegate();
		
		getMaleStudents();
		getStudentsByGradeFilter();
		getStudentsByGpaFilter();

	}

	private static void getStudentsByGpaFilter() {
		// TODO Auto-generated method stub
		
	}

	private static void getStudentsByGradeFilter() {
		// TODO Auto-generated method stub
		
	}

	private static void getMaleStudents() {
		System.out.println("getMaleStudents :");
		studentList.forEach(student -> {
			if (filterByGender_male.test(student)) {
				System.out.println(student.getName());
			}
		});
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
