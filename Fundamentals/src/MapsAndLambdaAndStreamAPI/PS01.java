package MapsAndLambdaAndStreamAPI;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PS01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double,Integer> numberOccurences = new TreeMap<>();

        double[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(elements -> Double.parseDouble(elements)).toArray();

        for(int i=0; i< arr.length; i++){

            Integer occurences = numberOccurences.get(arr[i]);
            if(occurences == null){
                occurences =0;
            }
            numberOccurences.put(arr[i], occurences+1);
        }

        for (Map.Entry<Double, Integer> entry : numberOccurences.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.println(df.format(entry.getKey())+" -> "+df.format(entry.getValue()));
        }

    }
}
