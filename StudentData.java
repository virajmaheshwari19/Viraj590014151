
public class StudentData {
    
    int rollNumber = 25;
    String studentName = "Viraj Maheshwari";

    public static void main(String[] args) {
        
        StudentData myObj = new StudentData();
        
        System.out.println("Student Information:");
        System.out.println("Name: " + myObj.studentName);
        System.out.println("Roll No: " + myObj.rollNumber);
        
        myObj.rollNumber = 50;
        System.out.println("Updated Roll No: " + myObj.rollNumber);
    }
}
