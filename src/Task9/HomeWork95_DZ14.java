/*
5*) Написать метод который найдет минимальный элемент матрицы.
 */
package Task9;

public class HomeWork95_DZ14 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 2},
                {3, 6, 3},
                {1, 1, 2}
        };
        System.out.println(minItemMatrix(matrix1));

    }

    public static int minItemMatrix(int[][] matrix) {
        int minItemMatrix = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                minItemMatrix = (minItemMatrix < matrix[i][j]) ? minItemMatrix : matrix[i][j];
            }
        }
        return minItemMatrix;
    }
}
