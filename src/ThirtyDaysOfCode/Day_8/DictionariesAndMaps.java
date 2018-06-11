package ThirtyDaysOfCode.Day_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
