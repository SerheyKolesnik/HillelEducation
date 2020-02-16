package Task11;

import java.math.BigInteger;

public class Task112 {
    public static void main(String[] args) {
        //boolean result = 0.1 + 0.2 == 0.3;
        int test = 3;
        BigInteger.valueOf(test).setBit(0);// установить бит
        BigInteger.valueOf(test).flipBit(0);// инвертировать бит
        System.out.println(BigInteger.valueOf(test).testBit(3));
//        int result = BigInteger.valueOf(test).flipBit(0).intValue();
        int result = test << 1;
        System.out.println(result);
    }
}
