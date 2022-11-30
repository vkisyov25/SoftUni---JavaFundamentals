package TextProcessing;

import java.util.Scanner;

public class PS01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("end")){
            String[] reverseWordArray =new String[word.length()];
            int j=0;
            for (int i= word.length()-1; i>=0; i--){

                reverseWordArray[j]= String.valueOf(word.charAt(i));
                j++;
            }
            String reverseWord = String.join("",reverseWordArray);
            String[] arr = reverseWord.split("");
            System.out.printf("%s = %s%n",word,reverseWord);

            word = scanner.nextLine();
        }
    }
}
