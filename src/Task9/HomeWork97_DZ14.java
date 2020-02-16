/*
7*) Написать метод который повернет матрицу на 90 градусов. Например:
1,2,3
4,5,6

результат:
4,1
5,2
6,3
**) результат скинуть ссылку на гитхаб где каждое задание сделано отдельным коммитом
 */
package Task9;

import java.util.Arrays;

public class HomeWork97_DZ14 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3},
                {5, 7},
                {4, 3}
        };
        printMatrix(rotateMatrix(matrix));
    }

    public static int[][] rotateMatrix(int[][] array) {
        int[][] rotateMatrix = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rotateMatrix[array[i].length - j - 1][i] = array[i][j];
            }
        }
        return rotateMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }
}
