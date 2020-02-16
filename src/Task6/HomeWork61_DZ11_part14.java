/*
14*) Простая игра и цикл while:
Компьютер задумывает число от 1 до 1000 и просит вас ввести число.
После этого он говорит вы угадали или число больше меньше.
Продолжается до тех пор пока пользователь не угадает число.
 */

package Task6;

import java.util.Random;
import java.util.Scanner;

public class HomeWork61_DZ11_part14 {

    public static void main(String[] args) {
        quary();
    }

    public static void quary() {
        Random random = new Random();
        int conceivedNumber = random.nextInt(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задумано число от 1 до 1000\nПопытайтесь ее угадать:");
        int num1 = scanner.nextInt();
        while (num1 != conceivedNumber) {
            if (num1 < conceivedNumber) {
                System.out.println("Задуманое число больше введенного вами числа\nПопытайтесь снова:");
                num1 = scanner.nextInt();
            } else {
                System.out.println("Задуманое число меньше введенного вами числа\nПопытайтесь снова:");
                num1 = scanner.nextInt();
            }
        }
        System.out.println("Поздравляю! Вы угадали!!\nЗадуманное число: " + num1);
    }
}
