abstract class sample{
    int a = 10;
    void f(){
        System.out.println(a);
    }
    abstract void function();
}

class child extends sample{
    child(){
        super();
    }
    void function(){
        System.out.println("Implementation of abstract function is done in child class");
    }
}
public class Abstraction {
     public static void main(String args[]) {
     child c = new child();
        c.f();
     }
    }
