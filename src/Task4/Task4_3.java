package Task4;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        System.out.printf("a %s b %s\n", a, b);
        int square;
        int cube;
        if (a > b) {
            int ta = a;
            a = b;
            b = ta;
        }
        int sumEven =0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
               sumEven += i;
            }
        }
        System.out.printf("Sum of Even digit %s", sumEven);
    }
}
