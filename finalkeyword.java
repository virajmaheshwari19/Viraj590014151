class A {
    final int variable1 = 10;  

    void show() {
        System.out.println("Value of variable1: " + variable1);
    }
}

class B {
    int variable = 20;

    void display() {
        System.out.println("Value of variable: " + variable);
    }
}

public class finalkeyword {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        a.show();
        b.display();
    }
}

