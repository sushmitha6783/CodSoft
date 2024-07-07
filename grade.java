import java.util.InputMismatchException;
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.println("Enter number of subjects:");
            int totalSubjects = scan.nextInt();
            
            if (totalSubjects <= 0) {
                System.out.println("Number of subjects must be positive.");
                return;
            }
            
            double totalMarks = 0;
    
            for (int i = 1; i <= totalSubjects; i++) {
                System.out.println("Enter the marks obtained in subject " + i + ":");
                double marksInEachSubject = scan.nextDouble();
                
                if (marksInEachSubject < 0 || marksInEachSubject > 100) {
                    System.out.println("Marks should be between 0 and 100.");
                    return;
                }
                
                totalMarks += marksInEachSubject;
            }
    
            double avgPercentage = totalMarks / totalSubjects;
    
            // Print total marks and average percentage
            System.out.println("Total marks: " + totalMarks);
            System.out.println("Average percentage of total marks: " + avgPercentage + "%");
    
            // Determine and print the grade
            if (avgPercentage >= 90) {
                System.out.println("Grade: A");
            } else if (avgPercentage >= 80) {
                System.out.println("Grade: B");
            } else if (avgPercentage >= 70) {
                System.out.println("Grade: C");
            } else if (avgPercentage >= 60) {
                System.out.println("Grade: D");
            } else if (avgPercentage >= 50) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: F");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } finally {
            scan.close();
        }
    }
}
