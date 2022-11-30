package DataTypesAndVariables;

import java.util.Scanner;

public class PS002 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        int sum= 0;
        int number= 0;
        while(num !=0){
            number = num % 10;
            sum +=number;
            num /=10;

            //if (num==0){
            //    break;
            //}

        }
        System.out.println(sum);
    }
}
