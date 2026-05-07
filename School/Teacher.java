package School;

public class Teacher extends Person{
    int teacherID;
    String subject;

    // Constructor
    Teacher(String name, int age, String address, int teacherID, String subject) {
        super(name, age, address);
        this.teacherID = teacherID;
        this.subject = subject;
    }

    // Override display method
    @Override
    void DisplayRecord() {
        super.DisplayRecord();
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Subject: " + subject);
    }
    
}
