package review;

import java.util.*;

public class wordSynonyms02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        List<String> synonymsList = new ArrayList<>();

        for (int i=0; i<n; i++){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if(wordSynonyms.get(word) == null){
                synonymsList = new ArrayList<>();
            }
            synonymsList.add(synonym);
            wordSynonyms.put(word,synonymsList);
        }

        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ", entry.getValue()));
        }

    }
}
