package Assignment3;
//command line
public class Exercise2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            int[] array = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                array[i] = Integer.parseInt(args[i]);
            }
            System.out.println("Maximum:" + Maximum(array));
            System.out.println("Minimum:" + Minimum(array));
        }

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
