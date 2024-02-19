package day23.step1;

import java.math.BigInteger;

public class A {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(2);
        int c = a.gcd(BigInteger.valueOf(4)).intValue();
        System.out.println(c);
    }
}
