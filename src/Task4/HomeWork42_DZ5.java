/*
Условие задачи:
Ввести целое число и определить, верно ли, что в его записи есть две одинаковые цифры.
Пример:
Введите целое число:
1234
Нет.
Введите целое число:
1224
Да.
 */
package Task4;

import java.util.Scanner;

public class HomeWork42_DZ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int n = scanner.nextInt();
        int n2 = 0;
        int CurDigit = 0;
        int CurDigit2 = 0;
        String result = "Нет";
        while (n != 0) {
            CurDigit = (n % 10);
            n2 = n / 10;
            while (n2 != 0) {
                CurDigit2 = (n2 % 10);
                if (CurDigit == CurDigit2) {
                    result = "Да";
                }
                n2 /= 10;
            }
            n /= 10;
        }
        System.out.println(result);
    }
}
