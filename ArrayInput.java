import java.util.Scanner; 
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("\n Your Array ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        sc.close(); 
    }
}