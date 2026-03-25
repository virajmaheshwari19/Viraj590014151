import java.util.*;

public class sortedmap {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    TreeMap<Integer, String> m = new TreeMap<>();

    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        System.out.print("Enter key: ");
        int k = sc.nextInt();
        System.out.print("Enter value: ");
        String v = sc.next();
        m.put(k, v);
    }

    System.out.print("Enter key to delete: ");
    int del = sc.nextInt();
    m.remove(del);

    System.out.print("Enter key to update: ");
    int uk = sc.nextInt();
    System.out.print("Enter new value: ");
    String uv = sc.next();
    m.put(uk, uv);

    System.out.println("Sorted Map elements:");
    for (Integer k : m.keySet()) {
        System.out.println(k + " " + m.get(k));
    }
}

}