/*
1) Вывести вероятность:
- на 3 монетках выпало одна сторона
 */
package Task7;

import java.util.Random;

public class HomeWork71_DZ12_part13 {
    private static final Random RANDOM = new Random();
    public static final int COUNT = 1000000;

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < COUNT; i++) {
            int coin1 = coin();
            int coin2 = coin();
            int coin3 = coin();
            if (coin1 == coin2 && coin2 == coin3) {
                count++;
            }
        }
        double probability = count / (double) COUNT * 100;
        System.out.println("Вероятность, что на трех монетах выпала одна сторона: " + probability + " %");
    }

    private static int coin() {
        return RANDOM.nextInt(2);
    }
}
