/*
1) Вывести вероятность:
- на 3 кубиках все значения разные
 */

package Task7;

import java.util.Random;

public class HomeWork71_DZ12_part12 {
    private static final Random RANDOM = new Random();
    public static final int COUNT = 1000000;

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < COUNT; i++) {
            int dice1 = dice();
            int dice2 = dice();
            int dice3 = dice();
            if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
                count++;
            }
        }
        double probability = count / (double)COUNT * 100;
        System.out.println("Вероятность, что на 3х кубиках все значения разные: " + probability + " %");
    }

    private static int dice() {
        return RANDOM.nextInt(6) + 1;
    }
}
