package InterviewPreparationKit.Solution3;

import java.util.Scanner;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {

        int jumps = 0;

        for (int i = 0; i < c.length; i++) {
            if((i < c.length - 2) && (c[i+2] == 0)) {
                i = i+1;
                jumps++;
            } else if ((i < c.length -1) && (c[i+1] == 0)) {
                jumps++;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (
                int i = 0;
                i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
