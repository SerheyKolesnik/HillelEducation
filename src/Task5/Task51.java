package Task5;

public class Task51 {
    public static void main(String[] args) {
        int N = 50;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < N; i++) {
            int j = (int) (Math.random() * N);
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        for (int i = 0; i < N; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
