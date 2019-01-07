package DataStructures.Solution5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        int index = 0;
        int value = 0;

        Scanner scan = new Scanner(System.in);

        int elements = Integer.parseInt(scan.nextLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < elements; i++) {
            value = scan.nextInt();
            list.add(value);
        }

        int queries = scan.nextInt();
        for (int i = 0; i < queries; i++) {
            String query = scan.next();
            if (query.equals("Insert")){
                index = scan.nextInt();
                value = scan.nextInt();
                list.add(index, value);
            } else {
                index = scan.nextInt();
                list.remove(index);
            }
        }

        list.forEach(values -> {
            System.out.print(values + " ");
        });
    }
}
