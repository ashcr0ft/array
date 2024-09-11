import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        boolean[] third = new boolean[2];
        third[0] = true;

        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i]);
            if (i < first.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i]);
            if (i < second.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < third.length; i++) {
            System.out.print(third[i]);
            if (i < third.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = first.length - 1; i >= 0; i--) {
            System.out.print(first[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = second.length - 1; i >= 0; i--) {
            System.out.print(second[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = third.length - 1; i >= 0; i--) {
            System.out.print(third[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                first[i]+=1;
            }
        }
        System.out.println(Arrays.toString(first));
    }
}