package Strings.Solution3;

import java.util.*;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> list = new ArrayList<>();

        for(int i = 0; i <= s.length()-k;i++){
            list.add(s.substring(i,i+k));
        }

        largest = list.stream().max(Comparator.comparing(String::valueOf)).get();
        smallest = list.stream().min(Comparator.comparing(String::valueOf)).get();
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
