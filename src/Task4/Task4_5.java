/*
Пользователь вводит целые числа
когда введет 0
нужно выдать сумму введенных чисел
 */

package Task4;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 1;
        int sumDigit=0;
        System.out.println("Вводите целые числа");
        while(num1!=0){
                    num1 = scanner.nextInt();
                    sumDigit=sumDigit+num1;

        }
        System.out.printf("Сумма введенных чисел равна %s", sumDigit);
    }
}
