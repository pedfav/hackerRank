package BigNumber.Solution2;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        BigInteger bigDec1 = new BigInteger((String)n);

        if(bigDec1.isProbablePrime(1)){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        scanner.close();
    }
}
