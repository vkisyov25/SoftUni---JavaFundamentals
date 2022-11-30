package review;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        Map<String,Integer> ventsy = new LinkedHashMap<>();

        for (int i=0; i<arr.length; i++){
            String word = arr[i];
            for(int j=0; j<word.length(); j++){
                String word1 = String.valueOf((word.charAt(j)));
                Integer isHave = ventsy.get(word1);
                if(isHave == null){
                    isHave=0;
                }
                ventsy.put(word1,isHave+1);
            }
        }

        for (Map.Entry<String, Integer> entry : ventsy.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}
