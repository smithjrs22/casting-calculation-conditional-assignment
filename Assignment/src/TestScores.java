import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Name a number between 0 and 100");
    int grade = Integer.valueOf(input.nextLine());
    if (grade >= 0 && grade <= 60 ) {
        System.out.println(" Your grade is an F");   
    } else if (grade >= 60 && grade < 70) {
        System.out.println("Your grade is a D"); 
    } else if (grade >= 70 && grade < 80) {
        System.out.println("Your grade is a C"); 
    } else if (grade >= 80 && grade < 90) {
        System.out.println("Your grade is a B");  
    } else if (grade >= 90 && grade <= 100) {
        System.out.println("Your grade is an A");  
    }
        
    }
}
