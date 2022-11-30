package TextProcessing;

import java.util.Scanner;

public class PS02ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        StringBuilder sbText = new StringBuilder(scanner.nextLine());

        int sum=0;

        int firstIndex = sbText.indexOf(String.valueOf(firstChar));
        int secondIndex = sbText.indexOf(String.valueOf(secondChar));

        if(firstIndex==-1 && secondIndex !=-1){
            String text = sbText.substring(0, secondIndex);
            for (int i=0; i<text.length(); i++){
                sum += text.charAt(i);
            }

        } else if (firstIndex != -1 && secondIndex==-1) {
            String text = sbText.substring(firstIndex);
            for (int i=0; i<text.length(); i++){
                sum += text.charAt(i);
            }
        } else if (firstIndex==-1 && secondIndex==-1) {
            String text = sbText.substring(0);
            for (int i=0; i<text.length(); i++){
                //if(Character.isDigit(text.charAt(i))){
                //    sum += Character.getNumericValue(text.charAt(i));
               // }else {
                    sum += text.charAt(i);
               // }
            }
        } else if (firstIndex !=-1 && secondIndex !=-1) {
            String text = sbText.substring(firstIndex, secondIndex);
            for (int i=0; i<text.length(); i++){
                sum += text.charAt(i);
            }
        }

        System.out.println(sum);
    }
}
