package TextProcessing;

import java.util.Scanner;

public class PS001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(", ");
        StringBuilder ventsy = new StringBuilder();
        for (int i=0; i<arr.length; i++){
            String word = arr[i];
            if(word.length()>3 && word.length()<16){
                for(int j=0; j<word.length(); j++){
                    if(Character.isDigit(word.charAt(j)) || Character.isLetter(word.charAt(j)) || word.charAt(j)=='-'|| word.charAt(j)=='_'){
                        ventsy.append(word.charAt(j));
                    }else {
                        break;
                    }
                }
                System.out.println(ventsy);
                ventsy = new StringBuilder();
            }
        }

    }
}
