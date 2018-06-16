package BigNumber.Solution3;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger bigDec1 = new BigInteger((String)scan.nextLine());
        BigInteger bigDec2 = new BigInteger((String)scan.nextLine());

        System.out.println(bigDec1.add(bigDec2));
        System.out.println(bigDec1.multiply(bigDec2));
    }
}
