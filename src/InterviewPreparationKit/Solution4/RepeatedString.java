package InterviewPreparationKit.Solution4;


import java.util.Scanner;

public class RepeatedString {

    static long repeatedString(String s, long n) {

        long numberOfAs = s.chars()
                .filter(ch -> ch == 'a')
                .count();

        long fits = n / s.length();
        int stringToCompleteN = 0;

        if ((s.length() * fits) < n) {
            stringToCompleteN = Math.toIntExact(n - (s.length() * fits));
        }

        return (numberOfAs * fits) + s.substring(0, stringToCompleteN).chars()
                .filter(ch -> ch == 'a')
                .count();
    }

    public static void main(String[] args) {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
