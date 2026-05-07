package School;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ram", 40, "Kathmandu", 990, "JAVA");
        Student s1 = new Student("Purna", 19, "lalitpur", 24070735, "A");

        System.out.println("Teacher Details:");
        t1.DisplayRecord();

        System.out.println("\nStudent Details:");
        s1.DisplayRecord();
    }
}
