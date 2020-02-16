/*
1) написать 3 метода:
a) метод который печатает переданную в него матрицу
b) метод который заполняет случайными числами переданную в него матрицу
c) метод в который передается матрица и число. Метод должен умножить каждый элемент матрицы на число

Продемонстрировать работу всех методов.
(!!!) Результат залить на гитхаб и скинуть ссылку на репозиторий
 */
package Task9;

import java.util.Arrays;
import java.util.Random;

public class HomeWork91_DZ14 {
    public static void main(String[] args) {
        System.out.println("Печать матрицы, заполненной случайными числами");
        printMatrix(randomMatrix());
        System.out.println("Печать матрицы, помноженной на 10");
        printMatrix(factorMatrix(randomMatrix(), 10));
    }

    private static int[][] factorMatrix(int[][] matrix, int factor) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] * factor;
            }
        }
        return matrix;
    }

    private static int[][] randomMatrix() {
        Random random = new Random();
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }
}

