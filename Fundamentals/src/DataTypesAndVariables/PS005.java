package DataTypesAndVariables;

import java.util.Scanner;

public class PS005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int startNum = Integer.parseInt(scanner.nextLine());
         int endNum = Integer.parseInt(scanner.nextLine());

         for (int i=startNum; i<=endNum; i++){
             String num = String.valueOf(i);
             System.out.print((char)i+" ");
         }
    }
}
