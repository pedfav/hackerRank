package Strings.Solution4;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(A.equals(new StringBuilder(A).reverse().toString())){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
