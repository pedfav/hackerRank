package javaTests.Strings;

import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        
        if(A.equalsIgnoreCase(new StringBuilder(A).reverse().toString())){
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}
