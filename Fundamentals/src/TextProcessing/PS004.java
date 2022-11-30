package TextProcessing;

import java.util.Scanner;

public class PS004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int i=0; i<text.length(); i++){
            int ventsy = text.charAt(i);
            char v = (char) (ventsy + 3);
            System.out.print(v);
        }
    }
}
