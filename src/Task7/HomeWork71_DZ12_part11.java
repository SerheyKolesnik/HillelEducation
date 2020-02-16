/*
1) Вывести вероятность:
- на 2 кубиках выпало одинаковое число
 */
package Task7;

import java.util.Random;

public class HomeWork71_DZ12_part11 {
    private static final Random RANDOM = new Random();
    public static final int COUNT = 10000000;

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < COUNT; i++) {
            int dice1 = dice();
            int dice2 = dice();
            if (dice1 == dice2) {
                count++;
            }
        }
        double probability = count / (double) COUNT * 100;
        System.out.println("Вероятность, что на двух кубиках выпало одинаковое число "
                + probability + " %");
    }

    private static int dice() {
        return RANDOM.nextInt(6) + 1;
    }
}
