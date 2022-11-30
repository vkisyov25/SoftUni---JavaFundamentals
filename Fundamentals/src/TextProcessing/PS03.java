package TextProcessing;

import java.util.Scanner;

public class PS03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text = scanner.nextLine();

        int currentIndex = text.indexOf(word);
        while (currentIndex != -1){
            text = text.replace(word,"");

            currentIndex = text.indexOf(word);
        }
        System.out.print(text);
    }
}
