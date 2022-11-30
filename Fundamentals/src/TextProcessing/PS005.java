package TextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class PS005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String num1 = scanner.nextLine().replaceFirst("^0+","");
        int num2 = Integer.parseInt(scanner.nextLine());

        if(num2==0){
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        int carry =0;
        for(int i=num1.length()-1; i>=0; i--){
            int digit = Integer.parseInt(String.valueOf(num1.charAt(i)));

            int result = digit * num2 + carry;

            if(i==0){
                sb.insert(0,result);
            }else {
                int resDigit = result%10;
                carry  = result/10;
                sb.insert(0,resDigit);
            }

        }
        System.out.println(sb);

    }
}
