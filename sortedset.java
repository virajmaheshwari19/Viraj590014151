import java.util.*;

public class sortedset {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    TreeSet<Integer> s = new TreeSet<>();

    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        s.add(x);
    }

    System.out.print("Enter number to delete: ");
    int del = sc.nextInt();
    s.remove(del);

    System.out.print("Enter number to add: ");
    int add = sc.nextInt();
    s.add(add);

    System.out.println("Sorted Set elements:");
    for (Integer x : s) {
        System.out.println(x);
    }
}

}