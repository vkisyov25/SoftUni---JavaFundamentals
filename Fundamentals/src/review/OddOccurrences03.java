package review;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> ventsy = new LinkedHashMap<>();

        String[] arr = scanner.nextLine().split(" ");

        for (int i=0; i<arr.length; i++){
            String word = arr[i].toLowerCase();
            Integer isHave = ventsy.get(word);
            if(isHave == null){
                isHave=0;
            }
            ventsy.put(word,isHave+1);

        }

        List<String> oddWordIndex = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : ventsy.entrySet()) {
            if(entry.getValue() %2 !=0){
                oddWordIndex.add(entry.getKey());
            }
        }

        for (int j=0; j<oddWordIndex.size(); j++){
            System.out.print(oddWordIndex.get(j));
            if(j<oddWordIndex.size()-1){
                System.out.print(", ");
            }
        }

    }
}
