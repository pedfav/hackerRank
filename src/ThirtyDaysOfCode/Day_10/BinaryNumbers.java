package ThirtyDaysOfCode.Day_10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> binary = Arrays.asList(Integer.toBinaryString(n).split("0"));

        System.out.println(binary.stream().max(Comparator.comparing(String::length)).get().length());

        scanner.close();
    }
}

