package functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> printStudent = (student) -> System.out.println(student);
	static Consumer<Student> printStudentName = (student) -> System.out.println(student.getName());
	static Consumer<Student> printStudentActivities = (student) -> System.out.println(student.getActivities());
	
	public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		printStudents(studentList);
		printStudentsName(studentList);
		printNameAndActivities(studentList);
		printNameAndActivitiesUsingCondition(studentList);
	}

	private static void printNameAndActivitiesUsingCondition(List<Student> studentList) {
		System.out.println("printNameAndActivitiesUsingCondition");
		studentList.forEach((student) -> {
			if (student.getGradeLevel() >= 3) {
				printStudentName.andThen(printStudentActivities).accept(student);;
			}
		});
	}
	
	private static void printNameAndActivities(List<Student> studentList) {
		System.out.println("printNameAndActivities");
		studentList.forEach(printStudentName.andThen(printStudentActivities)); // Consumer chaining
 	}

	private static void printStudentsName(List<Student> studentList) {
		System.out.println("printStudentsName");
		studentList.forEach(printStudentName);
	}

	private static void printStudents(List<Student> studentList) {
		System.out.println("printStudents");
		studentList.forEach(printStudent);
	}
}
