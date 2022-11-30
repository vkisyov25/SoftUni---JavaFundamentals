package MapsAndLambdaAndStreamAPI;

import java.util.*;

public class PS02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> wordSynonums = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        //List<String> synonums = new ArrayList<>();
        for(int i=0; i<n; i++){
            String word1 = scanner.nextLine();
            String word2 = scanner.nextLine();


            if(wordSynonums.get(word1)==null){
                //synonums = new ArrayList<>();
                wordSynonums.put(word1,new ArrayList<>());
            }
            wordSynonums.get(word1).add(word2);
            //synonums.add(word2);
            //wordSynonums.put(word1, synonums);
        }

        for (Map.Entry<String, List<String>> entry : wordSynonums.entrySet()) {
            System.out.println(entry.getKey()+" - "+String.join(", ",entry.getValue()));
        }


    }
}
