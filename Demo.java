class GrandParent { GrandParent() {} }
class Parent extends GrandParent { Parent() { super(); /* OK */ } }
class Child extends Parent {
    Child() {
        super(); // OK - first and only call
        super(); // Error: must be first statement
         super.super(); // Error: no such syntax
    }
}

public class Demo {
    public static void main(String[] args) { new Child(); }
}