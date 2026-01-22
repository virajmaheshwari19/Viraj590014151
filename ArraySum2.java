import java.util.Scanner;

public class ArraySum2 {
    public static void main(String[] args) {
        int sum, sum_array = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the sum:");
        sum = s.nextInt();

        int arr[] = new int[5];
        System.out.println("Enter elements:");

        for (int i = 0; i < 5; i++) {
            //arr[i] = s.nextInt();
            sum_array += arr[i];
        }

        if (sum == sum_array) {
            System.out.println("Yes, Correct");
        } else {
            System.out.println("No, Incorrect");
        }

        s.close();
    }
}
