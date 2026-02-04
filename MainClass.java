class Book {
    String title;

    Book() {
        title = "Java Programming for Beginners";
        System.out.println("Constructor is called: Book object created!");
    }
}
public class MainClass {
    public static void main(String[] args) {
            
        Book myBook = new Book();
        
        System.out.println("Book Title: " + myBook.title);
    }
}
