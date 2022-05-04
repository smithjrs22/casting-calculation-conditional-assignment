import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = String.valueOf(input.nextLine());
    System.out.println("Enter another word");
    String wordTwo = String.valueOf(input.nextLine());
    if (word.equals(wordTwo)) {
        System.out.println("The words are the same");
    } else {
        System.out.println("The words are different");   
        }
    }
}
