package javaTests.Strings;

import java.util.Scanner;

class Solution8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
	}
}

class MyRegex {
	String pattern;

	MyRegex() {
		String ipPart = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		pattern = ipPart + "." + ipPart + "." + ipPart + "." + ipPart;

	}
}