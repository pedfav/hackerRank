package Strings.Solution6;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        if(s.matches("[A-Za-z !,?._'@]+") && !s.trim().equals("")){
            System.out.println(s.trim().split("[ !,?._'@]+").length);
            Arrays.stream(s.trim().split("[ !,?._'@]+")).forEach(System.out::println);
        } else {
            System.out.println(0);
        }

        scan.close();
    }
}
