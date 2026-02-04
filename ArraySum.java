import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many numbers? ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        int total = 0; 
        
        System.out.println("Enter your values:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < size; i++) {
            total = total + arr[i];
        }
        
        System.out.println("The final sum is: " + total);
        
        sc.close();
    }
}
