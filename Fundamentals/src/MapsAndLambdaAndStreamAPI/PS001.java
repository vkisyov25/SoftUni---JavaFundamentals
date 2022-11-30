package MapsAndLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PS001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        Map<String,Integer> ventsy = new LinkedHashMap<>();

        for (int i=0; i< text.length; i++){
            int length = text[i].length();
            String[] arr = text[i].split("");
            for(int j=0; j< arr.length; j++){
                Integer accurances = ventsy.get(arr[j]);
                if(accurances ==null){
                    accurances=0;
                }
                ventsy.put(arr[j],accurances+1);
            }

        }

        for (Map.Entry<String, Integer> entry : ventsy.entrySet()) {
            System.out.println(entry.getKey()+" -> "+ entry.getValue());
        }

    }



}
