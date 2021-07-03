package Assignments;
import java.util.Scanner;

public class A7Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        if (word.length() >= 5 && word.length() / 2 != 0)
        {
            System.out.print(word.charAt(word.length() / 2 - 1));
            System.out.print(word.charAt(word.length() / 2 ));
            System.out.print(word.charAt(word.length() / 2 + 1));
        }
        else
            System.err.print("404...Invalid");
    }
}
