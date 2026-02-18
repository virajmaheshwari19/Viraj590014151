import java.io.*;
import java.util.Scanner;

public class FileAssignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            File file = new File("sample.txt");

            if (!file.exists()) {
                file.createNewFile();
            }
            System.out.println("Current content of sample.txt:\n");

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            boolean empty = true;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                empty = false;
            }
            if (empty) {
                System.out.println("File is empty");
            }

            br.close();
            System.out.println("\nEnter something to write into the file:");
            String input = sc.nextLine();

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(input);
            bw.close();

            System.out.println("\nFile updated successfully.\n");
            System.out.println("Updated content:\n");
            BufferedReader br2 = new BufferedReader(new FileReader(file));

            while ((line = br2.readLine()) != null) {
                System.out.println(line);
            }
            br2.close();
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
