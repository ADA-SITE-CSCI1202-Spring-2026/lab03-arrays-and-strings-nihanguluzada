package Assignment3;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }

    // b) Define a method that takes a single parameter of type String and returns its reverse
    public static String reverse(String str) {

        // d) StringBuilder
        StringBuilder sb = new StringBuilder();

        // c)charAt(index)
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}


