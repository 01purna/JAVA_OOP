package NEW;
public class A {
    static int x = 0;
    int y = 0;
    void IncrementValues(){
       x = x + 1;
       y = y + 1;
    }
    void Display(){
        System.out.println("static value " + x );
        System.out.println("instance value " + y);
    }
    public static void main(String[] args) {
        A a1 = new A();
        a1.IncrementValues();
        a1.Display();
        A a2 = new A();
        a2.IncrementValues();
        a2.Display();
    }
}
