/*
2.1*) Написать метод который принимает 2 матрицы одного размера
и вернет сумму 2 матриц - каждый элемент будет суммой
оотв. элементов матриц параметров.
 */
package Task9;

import java.util.Arrays;

public class HomeWork92_DZ14 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 2},
                {3, 2, 3},
                {1, 1, 2}
        };
        int[][] matrix2 = {
                {4, 5, 5},
                {2, 4, 4},
                {3, 1, 1},
        };
        int[][] newMatrix = multiplyMatrix(matrix1, matrix2);
        printMatrix(newMatrix);
    }

    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] multiplicationMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                multiplicationMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return multiplicationMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }
}
