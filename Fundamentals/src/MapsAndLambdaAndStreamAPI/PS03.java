package MapsAndLambdaAndStreamAPI;

import java.util.*;

public class PS03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        Map<String,Integer> words = new LinkedHashMap<>();

        //int curentCount=0;

        for (int i=0; i< arr.length; i++){
            String currentWord = arr[i].toLowerCase(Locale.ROOT);
            Integer curentCount = words.get(currentWord);
            if(curentCount ==null){
                curentCount = 0;
            }
            words.put(currentWord, curentCount+1);
            //curentCount = words.get(currentWord);
        }


        List<String> oddWordIndex = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
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
