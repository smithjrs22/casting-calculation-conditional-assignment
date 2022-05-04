import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int numOne = Integer.valueOf(input.nextLine());
        System.out.println("Enter another number:");
        int numTwo = Integer.valueOf(input.nextLine());
        System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
        System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
        System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
        System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));
        System.out.println(numOne + " % " + numTwo + " = " + (numOne % numTwo));

    }
}
