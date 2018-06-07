package Strings.Solution1;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length() + B.length());

        if(A.compareTo(B) < 0){
        	System.out.println("No");
        } else if (A.compareTo(B) == 0){
        	System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1, A.length()) + " " + B.substring(0,1).toUpperCase() + B.substring(1, B.length()));
    }
}
