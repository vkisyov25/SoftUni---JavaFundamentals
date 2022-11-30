package Methods;

import java.util.Scanner;

public class PS08 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println(mathPow(num1,num2));

    }
    public  static double mathPow(double num1,int num2){
        double result = Math.pow(num1,num2);

        return result;
    }
}
