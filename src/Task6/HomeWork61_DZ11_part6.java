/*
6) Попросить пользователя ввести 3 числа.
Используя if-else вывести минимальное и максимальное из этих чисел.
 */
package Task6;

import java.util.Scanner;

public class HomeWork61_DZ11_part6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        int minNum;
        int maxNum;
        if(num1 < num2){
            minNum = num1;
             maxNum = num2;
        }else{
            minNum = num2;
             maxNum = num1;
        }
        System.out.printf("Минимальное число: %s\nМаксимальное число: %s", minNum, maxNum );
    }
}
