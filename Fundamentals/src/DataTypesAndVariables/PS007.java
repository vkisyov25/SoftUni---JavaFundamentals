package DataTypesAndVariables;

import java.util.Scanner;

public class PS007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         byte n = Byte.parseByte(scanner.nextLine());
         int sum = 0;

         for (byte i=0; i<n; i++){
             short currentNum = Short.parseShort(scanner.nextLine());
             //sum = currentNum;

             if(sum<255){
                sum += currentNum;
             }
             if(sum>255) {
                 System.out.println("Insufficient capacity!");
                 sum -=currentNum;
             }
         }
         System.out.println(sum);

    }
}
