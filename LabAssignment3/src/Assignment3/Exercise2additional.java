package Assignment3;
import java.util.Scanner;

public class Exercise2additional {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter n numbers:");

        int[] userArray = new int[n];
        for (int i = 0; i < n; i++) {
            userArray[i] = sc.nextInt();
        }
        System.out.println("Minimum: " + Minimum(userArray));
        System.out.println("Maximum: " + Maximum(userArray));
    }
    public static int Minimum(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int Maximum(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

}
