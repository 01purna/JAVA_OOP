package Login;

public class Person{

    String username, password;

    Person(String username, String password){
        this.username = username;
        this.password = password;
    }
    boolean LogAuth(String u, String p){
        if(this.username.equals(u) && this.password.equals(p)){
            System.out.println("loggin succesfull , welcome back " + this.username);
            return true;
        }else{
            return false;
        }
    }
    void Dashboard(){
        System.out.println("this is Dashboard");
    }
}