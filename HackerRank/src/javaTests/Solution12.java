package javaTests;

import java.util.Calendar;
import java.util.Scanner;

public class Solution12 {
	public static String getDay(String day, String month, String year) {
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR, Integer.parseInt(year));
		cal.set(Calendar.MONTH, Integer.parseInt(month) - 1);
		cal.set(Calendar.DATE, Integer.parseInt(day));

		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			return("SUNDAY");
		case 2:
			return("MONDAY");
		case 3:
			return("TUESDAY");
		case 4:
			return("WEDNESDAY");
		case 5:
			return("THURSDAY");
		case 6:
			return("FRIDAY");
		case 7:
			return("SATURDAY");
		}

		return null;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		System.out.println(getDay(day, month, year));
	}
}