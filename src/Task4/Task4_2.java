package Task4;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        System.out.printf("a %s b %s", a, b);
        int square;
        int cube;
        if (a > b) {
            int ta = a;
            a = b;
            b = ta;
        }
        for (int i = a; i <= b; i++) {
            System.out.printf("%s square %s cube %s\n", i, Math.pow(i, 2), Math.pow(i, 3));
        }
    }
}
