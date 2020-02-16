package Task11;

public class Task111 {
    static int MAX_COUNT = 5000;

    public static void main(String[] args) {

        long time1 = System.currentTimeMillis();
        int count = 0;
        int value = 2;
        while (count < MAX_COUNT) {
            if (isPrime(MAX_COUNT)) {
                count++;
            }
            value++;
        }
        long diff = System.currentTimeMillis() - time1;
        System.out.println(diff);
    }

    public static boolean isPrime(int num) {
        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
