package Students1;

import java.util.*;


public class Main {


	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		List<Student> students = new ArrayList<>();
		while (!input.equals("end")){
			// read students
			String[] studentsData = input.split(" ");

			String firstName = studentsData[0];
			String lastName = studentsData[1];
			int age = Integer.parseInt(studentsData[2]);
			String town = studentsData[3];

			if (StudentDuplicate(students, firstName, lastName)) {
				Student student = getStudent( students, firstName, lastName);
				student.setAge(age);
				student.setHomeTown(town);
			} else {
				Student student = new Student(firstName, lastName, age, town);
				students.add(student);
			}


			input = scanner.nextLine();
		}

		String filterCity = scanner.nextLine();

		for (Student student : students) {
			if (student.getHomeTown().equals(filterCity)) {
				System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
			}
		}

	}

	private static boolean StudentDuplicate (List<Student> students, String firstName, String lastName) {
		for (Student student : students) {
			if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	private static Student getStudent(List<Student> students, String firstName, String lastName) {
		Student existingStudent = null;
		for (Student student : students) {
			if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
				existingStudent = student;
			}
		}
		return existingStudent;
	}

}
