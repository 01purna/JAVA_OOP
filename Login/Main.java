package Login;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Teacher t1 = new Teacher("Ram" ,"Ram99",  "java", 99000);
        Student s1 = new Student("purna", "purna01", "A+");

        System.out.println("---College Loggin system---");
        System.out.println("Enter you username");
        String u = sc.nextLine();

        System.out.println("Enter you password");
        String p = sc.nextLine();

        if(t1.LogAuth(u , p)){
            t1.Dashboard();
        }else if(s1.LogAuth(u, p)){
            s1.Dashboard();
        }else{
            System.out.println("User not found");
        }
    }
}
