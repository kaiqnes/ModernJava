package functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import data.Student;
import data.StudentDataBase;

public class BiConsumerExample {

	static BiConsumer<String, List<String>> print = (name, activies) -> System.out.println(name + " : " + activies);
	
	public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		printNameAndActivities(studentList);
	}

	private static void printNameAndActivities(List<Student> studentList) {
		System.out.println("printNameAndActivities");
		studentList.forEach((student) -> print.accept(student.getName(), student.getActivities()));
	}

}
