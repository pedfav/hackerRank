package Strings.Solution5;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        if(a.length() == b.length()){
            a = a.toLowerCase();
            b = b.toLowerCase();
            char[] ca = a.toCharArray();
            char[] cb = b.toCharArray();

            Arrays.sort(ca);
            Arrays.sort(cb);

            String A = new String (ca);
            String B = new String (cb);

            if(A.equals(B)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
