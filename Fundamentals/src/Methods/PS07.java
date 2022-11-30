package Methods;

import java.util.Scanner;

public class PS07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(text,n));

    }
    public static String repeatString(String text, int n){
        String textArr =" ";
        for (int i=0; i<n; i++){
            textArr += text;
        }
        return  textArr;
    }
}
