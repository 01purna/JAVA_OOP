package School;

public class Student extends Person {
    int studentID;
    String grade;

    // Constructor
    Student(String name, int age, String address, int studentID, String grade) {
        super(name, age, address);
        this.studentID = studentID;
        this.grade = grade;
    }

    // Override display method
    @Override
    void DisplayRecord() {
        super.DisplayRecord();
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade: " + grade);
    }
}

