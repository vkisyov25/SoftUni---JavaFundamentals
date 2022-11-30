package Methods;

import java.util.Scanner;

public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        System.out.println(vowelsCount(text));
    }

    public static int vowelsCount(String text){
        int count=0;
        for (int i=0; i< text.length(); i++){
            if(text.charAt(i) == 'A' || text.charAt(i) == 'a' || text.charAt(i) == 'E' || text.charAt(i) == 'e' || text.charAt(i) == 'I' || text.charAt(i) == 'i' ||text.charAt(i) == 'O' || text.charAt(i) == 'o' ||text.charAt(i) == 'U' || text.charAt(i) == 'u'||text.charAt(i) == 'Y' || text.charAt(i) == 'y'){
                count++;
            }
        }

        return count;
    }
}
