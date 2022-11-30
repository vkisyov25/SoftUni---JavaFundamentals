package Methods;

import java.util.Scanner;

public class PS003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();
        char start1 = start.charAt(0);
        char end1 = end.charAt(0);

       charsBetweenTwoChars(start1,end1);

    }

    public static void charsBetweenTwoChars(char start, char end){
        if (start<end){
            for (int i=start +1; i<end; i++ ){
                System.out.print((char) i +" ");
            }
        }
        else{
            for (int i = end+1; i<start; i++){
                System.out.print((char) i +" ");            }
        }

    }
}
