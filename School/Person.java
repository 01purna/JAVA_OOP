package School;

public class Person {
    String name;
    int age;
    String address;

    // Constructor
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display record
    void DisplayRecord() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    
}
