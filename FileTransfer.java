import java.io.*;
import java.util.Scanner;

public class FileTransfer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            File file = new File("sample.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            System.out.println("Current content of sample.txt:\n");

            FileReader fr = new FileReader(file);
            int ch;
            boolean empty = true;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
                empty = false;
            }

            if (empty) {
                System.out.println("File is empty");
            }

            fr.close();

            System.out.println("\n\nEnter something to add into the file:");
            String input = sc.nextLine();

            FileWriter fw = new FileWriter(file, true); 
            fw.write("\n" + input);
            fw.close();

            System.out.println("\nFile updated successfully.\n");
            System.out.println("Updated content:\n");

            FileReader fr2 = new FileReader(file);

            while ((ch = fr2.read()) != -1) {
                System.out.print((char) ch);
            }

            fr2.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
