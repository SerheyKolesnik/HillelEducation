package Task8;

public class Task81 {
    public static void main(String[] args) {
        String s1 = "asdf";
        System.out.println(factorial(5));

    }

    public static int factorial(int num) {
        if (num ==2){
            return 2;
        }else{
            return num * factorial(num-1);
        }
    }
}
