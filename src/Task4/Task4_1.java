package Task4;

public class Task4_1 {
    public static void main(String[] args) {
        int square;
        int cube;
        for (int i = 1; i <= 8; i++) {
            square = i * i;
            cube = square * i;
            System.out.println(i + ", квадрат " + square + ", куб " + cube);
        }
        System.out.println("\n\n");

        for (int i = 1; i <=8 ; i++) {
            System.out.printf("square %s, cube %s \n", Math.pow(i,2),Math.pow(i,3));
        }
        System.out.println("\n\n");

        for (int i = 8; i >=1 ; i--) {
            System.out.printf("%s, square %s, cube %s\n", i , Math.pow(i,2), Math.pow(i,3));
        }
    }
}

