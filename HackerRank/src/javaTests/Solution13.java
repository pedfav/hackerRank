package javaTests;

import java.util.*;
import java.text.*;

public class Solution13 {
    
    public static void main(String[] args) {
    	java.util.Currency usd = java.util.Currency.getInstance("USD");
    	NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
       format.setCurrency(usd);
        
        // Write your code here.
        
        System.out.println("US: " + format.format(payment));
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
    }
}
