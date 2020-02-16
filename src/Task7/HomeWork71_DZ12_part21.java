/*
Человек подтягивается лесенкой: 1 раз, 2 раза, 3 раза, итд.
- Подсчитать сколько он всего раз подтянется за N подходов, N задано с клавиатуры
2.1*) каждое подтягивание занимает 5 секунд, перерыв 60 секунд.
Вывести сколько времени займет N подходов
2.2*) каждый следующий перерыв на 20% больше,
вести общее время в формате mm:ss (например 15:45)
 */
package Task7;

import java.util.Scanner;

public class HomeWork71_DZ12_part21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество подходов:");
        int round = scanner.nextInt();
        int first = 1;
        int step = 1;
        int sum = (first + round * step) / 2 * round;
        System.out.println("Итого подтягиваний за серию подходов: " + sum);
        int pullUp = 5;
        double rest = 60;
        double time = (sum * pullUp + (round - 1) * rest) / 60;
        System.out.println("Подтягивания займут времени: " + time + "'");
        double increment = 1.2;
        double restprog = (rest + (rest * Math.pow(increment, round - 1 - 1))) / 2 * 4;
        double time2 = (sum * pullUp + restprog) / 60;
        System.out.println("Общее время: " + (int) time2 + ":" + (int) ((sum * pullUp + restprog) % 60) + "'");
    }
}
