/*
Условия задачи:
Ввести целое число и найти сумму его цифр.
Пример:
Введите целое число:
1234
Сумма цифр числа 1234 равна 10.
 */
package Task4;

import java.util.Scanner;

public class HomeWork41_DZ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int n = scanner.nextInt();
        int baseNum = n;
        int sumDigit = 0;
        while (n != 0) {
            sumDigit += (n % 10);
            n /= 10;
        }
        System.out.printf("Сумма цифр числа %s равна %s", baseNum, sumDigit);
    }
}
