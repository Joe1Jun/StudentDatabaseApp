package student.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        boolean keepRunning = true;

        while (keepRunning) {

            Student studentTemp = new Student();
            studentTemp.enroll();
            students.add(studentTemp);

            int choice;
            System.out.println("1. Add another student");
            System.out.println("2. Quit");
            choice = input.nextInt();
            input.nextLine(); // Consume newline left-over

            if (choice != 1) {
                keepRunning = false;
            }

        } // end while

        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
            System.out.println("Grade Year: " + student.getGradeYear());
            System.out.println("Student Id:  " + student.getStudentId());
            System.out.println("Courses enrolled in " + student.getCourses());
        }

        input.close();
    }
}

