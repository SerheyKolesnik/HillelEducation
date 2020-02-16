/*
6*) написать метод который преобразует матрицу в одномерный массив.
Например если матрица была 3x4 то массив будет на 12 элементов.
 */
package Task9;

import java.util.Arrays;

public class HomeWork96_DZ14 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3},
                {5, 7},
                {4, 3}
        };
        System.out.println(Arrays.toString(matrixToArray(matrix)));
    }

    public static int[] matrixToArray(int[][] matrix) {
        int[] arr = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[count] = matrix[i][j];
                count++;
            }
        }
        return arr;
    }
}
