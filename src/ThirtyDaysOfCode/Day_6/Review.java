package ThirtyDaysOfCode.Day_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int tests = scan.nextInt();

        for(int i =0; i < tests; i++){
            String word = scan.next();
            List<Character> odd = new ArrayList<>();
            List<Character> even = new ArrayList<>();
            StringBuilder oddPrint = new StringBuilder();
            StringBuilder evenPrint = new StringBuilder();

            char[] wordChar = word.toCharArray();

            for(int j = 0; j < wordChar.length; j++){
                if(j%2 == 0){
                    even.add(wordChar[j]);
                } else {
                    odd.add(wordChar[j]);
                }
            }

            odd.forEach(character -> {
                oddPrint.append(character);
            });

            even.forEach(character -> {
                evenPrint.append(character);
            });
            System.out.println(evenPrint.toString() + " " + oddPrint.toString());
        }
    }
}
