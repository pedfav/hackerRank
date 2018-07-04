package ThirtyDaysOfCode.Day_16;

import java.util.Scanner;

public class ExceptionsStringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            System.out.println(Integer.valueOf(S));
        } catch (IllegalArgumentException e){
            System.out.println("Bad String");
        }
    }
}
