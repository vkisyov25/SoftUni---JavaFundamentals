package TextProcessing;

import java.util.Scanner;

public class PS05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        for(int i=0; i<text.length(); i++){
            if(Character.isDigit(text.charAt(i))){
                System.out.print(text.charAt(i));
            }
        }
        System.out.println();
        for(int i=0; i<text.length(); i++){
            if(Character.isLetter(text.charAt(i)) &&!(Character.isDigit(text.charAt(i)))){
                System.out.print(text.charAt(i));
            }

        }
        System.out.println();
        for(int i=0; i<text.length(); i++){
            if(!(Character.isLetter(text.charAt(i))) && !(Character.isDigit(text.charAt(i)))){
                System.out.print(text.charAt(i));
            }
        }
    }
}
