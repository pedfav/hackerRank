package javaTests;

import java.util.Scanner;

class Solution7 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int arr[] = new int[n];

			for (int j = 0; j < n; j++) {
				int temp = a;
				for (int inc = 0; inc <= j; inc++) {
					temp = temp + (int) (Math.pow(2, inc) * b);
				}
				 arr[j]=temp;
			}

			for (int k = 0; k < n; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
