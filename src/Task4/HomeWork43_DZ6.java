/*
Условие задачи:
Ввести натуральное число и определить, верно ли, что сумма его цифр равна 10.
Пример:
Введите число >= 0:
-234
Нужно положительное число.
Введите число >= 0:
1233
Нет
Введите число >= 0:
1234
Да
 */
package Task4;

import java.util.Scanner;

public class HomeWork43_DZ6 {

    public static void main(String[] args) {
        int n = inputNum();
        if (sumDigit(n) == 10) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static int inputNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число >= 0:");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Нужно положительное число.");
            System.out.println("Введите число >= 0:");
            n = scanner.nextInt();
        }
        return n;
    }

    public static int sumDigit(int n) {
        int sd = 0;
        while (n != 0) {
            sd += (n % 10);
            n /= 10;
        }
        return sd;
    }
}
