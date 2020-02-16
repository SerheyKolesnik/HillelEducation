/*
2.2*) Написать 2 метода, которым передают матрицу и индексы a, b
-Первый метод должен поменять 2 строки матрицы местами
-второй 2 столбца
 */
package Task9;

import java.util.Arrays;

public class HomeWork922_DZ14 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {5, 7, 4},
                {4, 3, 8}
        };
        System.out.println("Начальная матрица: ");
        printMatrix(matrix);
        System.out.println("\nМеняем строки в начальной матрице: ");
        printMatrix(rowReplacement(matrix, 0, 1));
        System.out.println("\nМеняем столбцы в измененной матрице: ");
        printMatrix(columnReplacement(matrix, 0, 1));
    }

    private static int[][] rowReplacement(int[][] matrix, int a, int b) {
        int tempValue = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            tempValue = matrix[a][i];
            matrix[a][i] = matrix[b][i];
            matrix[b][i] = tempValue;
        }
        return matrix;
    }

    private static int[][] columnReplacement(int[][] matrix, int a, int b) {
        int tempValue = 0;
        for (int i = 0; i < matrix.length; i++) {
            tempValue = matrix[i][a];
            matrix[i][a] = matrix[i][b];
            matrix[i][b] = tempValue;
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }

}
