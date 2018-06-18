package ThirtyDaysOfCode.Day_7;

import java.util.Scanner;

public class Arrays {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        StringBuilder output = new StringBuilder();

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            output.append(Integer.parseInt(arrItems[n-1-i]) + " ");
        }

        System.out.println(output.toString());
        scanner.close();
    }
}
