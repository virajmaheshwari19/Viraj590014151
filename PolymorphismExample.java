class Calculator
{
    int add(int a, int b)
    {
        return a + b;
    }

    int add(int a, int b, int c)
    {
        return a + b + c;
    }
}

class AdvancedCalculator extends Calculator
{
    @Override
    int add(int a, int b)
    {
        return a + b + 10;
    }
}

public class PolymorphismExample
{
    public static void main(String args[])
    {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(5, 10));
        System.out.println(c1.add(5, 10, 15));

        Calculator c2 = new AdvancedCalculator();
        System.out.println(c2.add(5, 10));
    }
}
