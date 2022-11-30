package TextProcessing;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text ="Hello and goodbay";
        String s= text.substring(6,text.length());

        System.out.print(s);

    }
}
