package student.app;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private Scanner input;

    public Student(Scanner input) {
        this.input = input;

        this.firstName = getFirstNameFromInput();
        this.lastName = getLastNameFromInput();
        this.gradeYear = getGradeYearFromInput();
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
}

