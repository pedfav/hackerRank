package Strings.Solution6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		if (!scan.hasNext()) {
			System.out.println(0);
		} else {
			String input = scan.nextLine();
			String[] splitted = input.trim().split("[ !,?._'@]+");
			ArrayList<String> listOfStrings = new ArrayList<String>(Arrays.asList(splitted));
			System.out.println(listOfStrings.size());

			for (String str : listOfStrings) {
				System.out.println(str);
			}
		}
    }
}
