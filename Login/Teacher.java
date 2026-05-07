package Login;

public class Teacher extends Person{
    String subject;
    int salary;

    Teacher(String username, String password, String subject, int salary){
        super(username, password);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void Dashboard(){
        System.out.println("this is teacher dashboard");
        System.out.println("subject:  " + this.subject + "\n salary : "+ this.salary );
    }
    
}
