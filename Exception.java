import java.util.Scanner;

class Employee {
    String name;
    int age;
    float salary;

    Employee(String name, int age, float salary) throws java.lang.Exception {

        if (name.length() > 20) {
            throw new java.lang.Exception("Name cannot exceed 20 characters.");
        }

        if (age <= 5) {
            throw new java.lang.Exception("Age must be greater than 5.");
        }

        if (salary > 125000) {
            throw new java.lang.Exception("Salary cannot exceed 125000.");
        }

        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Salary: ");
            float salary = sc.nextFloat();

            Employee e = new Employee(name, age, salary);

            System.out.println("Data inserted successfully.");

        } catch (java.lang.Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Execution completed.");
        }

        sc.close();
    }
}

