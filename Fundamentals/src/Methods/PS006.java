package Methods;

import java.util.Scanner;

public class PS006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        middleCharacter(text);
    }

    public static void middleCharacter(String text){
        if(text.length() % 2 == 0){
            System.out.printf("%c%c%n",text.charAt((text.length()/2)-1),text.charAt((text.length()/2)));
        }
        else{
            System.out.println(text.charAt((text.length()/2)));
        }
    }
}
