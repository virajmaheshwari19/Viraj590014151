public class SimpleTest {
    
    static int a = 10;
    
    int b = 20;

    public static void main(String[] args) {
        
        System.out.println("Static value a = " + a);
        
        SimpleTest obj = new SimpleTest();
        System.out.println("Non-static value b = " + obj.b);
        
    }
}
