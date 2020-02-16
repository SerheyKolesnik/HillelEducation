/*
1.1*) Пользователь вводит количество людей в группе, например 30.
Вывести вероятность того что как минимум у 2 из них день рождение в 1 один день.
 */
package Task7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork71_DZ12_part14 {
    private static final Random RANDOM = new Random();
    private static final int COUNT = 1000000;
    private static final int DAYSYEAR = 365;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people in the group:");
        int people = scanner.nextInt();
        int count = 0;

        int[] group = new int[people];
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < group.length - 1; j++) {
                group[j] = RANDOM.nextInt(DAYSYEAR);
            }
            Arrays.sort(group);
            for (int k = 0; k < group.length - 1; k++) {
                if (group[k] == group[k + 1]) {
                    count++;
                    break;
                }
            }
        }

        double probability = count / (double) COUNT * 100;
        System.out.println("Вероятность, что хотя бы два человека \n"
                + "из группы родились в один день: " + probability + " %");
    }
}
