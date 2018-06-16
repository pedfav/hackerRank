package DataStructures.Solution3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numTests = Integer.parseInt(scan.nextLine());

        List<List<Integer>> listArray = new ArrayList<>();
        for(int i = 0;i<numTests;i++){
            int numOfIntegers = scan.nextInt();
            List<Integer> intArrayList =  new ArrayList<>();
            for(int j=0;j<numOfIntegers;j++){
                intArrayList.add(new Integer(scan.nextInt()));
            }
            listArray.add(intArrayList);
            scan.nextLine();
        }

        int numQueries = Integer.parseInt(scan.nextLine());

        for(int i=0;i<numQueries;i++){
            int x = scan.nextInt()-1;
            int y = scan.nextInt()-1;
            scan.nextLine();
            if(x<listArray.size() && y<listArray.get(x).size()){
                System.out.println(listArray.get(x).get(y));
            }else{
                System.out.println("ERROR!");
            }
        }
    }
}
