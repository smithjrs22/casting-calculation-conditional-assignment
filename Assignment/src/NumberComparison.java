import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int numOne = Integer.valueOf(input.nextLine());
        System.out.println("Enter another number:");
        int numTwo = Integer.valueOf(input.nextLine());
        if (numOne == numTwo) {
            System.out.println("Numbers are the same");
        } else if (numOne > numTwo) {
            System.out.println("The first number was larger than the second");
        } else if (numTwo > numOne) {
            System.out.println("The second number was larger than the first");
        }
    }
}
