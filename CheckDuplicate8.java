import java.util.Scanner;

public class CheckDuplicate8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean found = false; 
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break; 
                }
            }
        }
        
        if (found) {
            System.out.println("The array contains duplicates.");
        } else {
            System.out.println("No duplicates found.");
        }
        
        sc.close();
    }
}