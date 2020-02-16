/*
2*) Дан кирпич со сторонами a,b,c и отверстие со сторонами x,y. Определить пройдет ли кирпич в отверстие.
Например кирпич со сторонами 2,3,2 не пройдет в отверстие 1x50.
 */
package Task11;

import java.util.Scanner;

public class HW11_02 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите размеры кирпича: a, b, c");
        int a = scaner.nextInt();
        int b = scaner.nextInt();
        int c = scaner.nextInt();
        System.out.println("Введите размеры отверстия: x, y");
        int x = scaner.nextInt();
        int y = scaner.nextInt();
        boolean r = brick(a, b, c, x, y);
        System.out.println((r == true)
                ? "Кирпич пройдет в отверстие:)" : "Кирпич не пройдет в отверстие:(");
    }

    public static boolean brick(int length, int width, int height, int holeLength, int holeWidth) {
        boolean result = false;
        if (length <= holeLength && width <= holeWidth || width <= holeLength && height <= holeWidth
                || height <= holeLength && width <= holeWidth) {
            result = true;
        } else if (width <= holeLength && length <= holeWidth || height <= holeLength && width <= holeWidth
                || width <= holeLength && height <= holeWidth) {
            result = true;
        }
        return result;
    }
}
