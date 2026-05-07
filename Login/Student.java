package Login;

public class Student extends Person{
    String grade;
    Student(String username, String password, String grade){
        super(username, password);
        this.grade = grade;
    }
    @Override
    void Dashboard(){
        System.out.println("this is student dashboard");
        System.out.println("grande: " + grade);
    }
}
