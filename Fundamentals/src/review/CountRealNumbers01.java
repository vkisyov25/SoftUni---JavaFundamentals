package review;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(element -> Double.parseDouble(element)).collect(Collectors.toList());

        Map<Double,Integer> ventsy = new TreeMap<>();

        for (int i=0; i<integerList.size(); i++){
            Integer isHave = ventsy.get(integerList.get(i));
            if(isHave == null){
                isHave =0;
            }
            ventsy.put(integerList.get(i), isHave+1);
        }

        for (Map.Entry<Double, Integer> entry : ventsy.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
