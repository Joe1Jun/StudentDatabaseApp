package student.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private int INITIAL_CAPACITY = 10;
	private String firstName;
	private String lastName;
	private String studentId;
	private ArrayList<String> courses;
	private int tuitionBalance;
	private int gradeYear;
	private static int costOfCourse = 600;
	private static int id = 1000;

	private Scanner input = new Scanner(System.in);

	public Student() {
		

		this.firstName = getFirstNameFromInput();
		this.lastName = getLastNameFromInput();
		this.gradeYear = getGradeYearFromInput();
		this.studentId = setStudentId();
		 this.courses = new ArrayList<>(); 
	}

	// generate an Id

	private String setStudentId() {
		// grade level
		id++;
		return this.studentId = gradeYear + "" + id;

	}

	public void enroll() {

		System.out.println("Enter courses (type 'done' to finish):");
		while (true) {
			String course = input.nextLine();
			if (course.equalsIgnoreCase("done")) {
				break;
			}
			courses.add(course);
		}

	}

	private String getFirstNameFromInput() {
		System.out.println("Enter student's first name:");
		return input.nextLine();
	}

	private String getLastNameFromInput() {
		System.out.println("Enter student's last name:");
		return input.nextLine();
	}

	private int getGradeYearFromInput() {
		System.out.println("Enter student class level");
		System.out.println("1. Freshman");
		System.out.println("2. Sophomore");
		System.out.println("3. Junior");
		System.out.println("4. Senior");

		int choice = input.nextInt();
		input.nextLine(); // Consume newline left-over

		switch (choice) {
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 3;
		case 4:
			return 4;
		default:
			throw new IllegalArgumentException("Invalid choice: " + choice);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getGradeYear() {
		return gradeYear;
	}

	public String getStudentId() {

		return studentId;
	}

	public String getCourses() {
        if (courses.isEmpty()) {
            return "No courses registered.";
        }
        return String.join(", ", courses);
    }
}
