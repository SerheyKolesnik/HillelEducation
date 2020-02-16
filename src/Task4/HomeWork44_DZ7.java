/*
Ввести натуральное число и определить, какие цифры встречаются несколько раз.
Пример:
Введите число >= 0:
2323
Повторяются: 2, 3
Введите число >= 0:
1234
Нет повторов.
 */
package Task4;

import java.util.Scanner;

public class HomeWork44_DZ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число >= 0:");
        int n = scanner.nextInt();
        int n2 = 0;
        int сurDigit = 0;
        int сurDigit2 = 0;
        String result = "";
        if (n < 0) {
            System.out.println("Нужно положительное число.");
            System.out.println("Введите число >= 0:");
            n = scanner.nextInt();
        }
        while (n != 0) {
            сurDigit = (n % 10);
            n2 = n / 10;
            while (n2 != 0) {
                сurDigit2 = (n2 % 10);
                if (сurDigit == сurDigit2) {
                    if (result.trim().length() == 0) {
                        result += сurDigit;
                    } else {
                        result = сurDigit + ", " + result;
                    }
                }
                n2 /= 10;
            }
            n /= 10;
        }
        if (result.trim().length() == 0) {
            result = "Нет повторов.";
        } else {
            result = "Повторяются: " + result;
        }
        System.out.println(result);
    }
}
