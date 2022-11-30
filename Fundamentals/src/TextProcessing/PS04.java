package TextProcessing;

import java.util.Scanner;

public class PS04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        String symbol ="";
        for (int i=0; i< words.length; i++){
            String word = words[i];
            int index = text.indexOf(word);
            while (index != -1){
                for(int j=0; j<word.length();j++){
                    symbol +="*";
                }

                text = text.replace(word,symbol);

                index = text.indexOf(word,index+ word.length());
                symbol ="";
            }
        }

        System.out.print(text);
    }
}
