package Methods;

import java.util.Scanner;

public class PS008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        divideOfFactorials(num1,num2);
    }

    public static double num1Factorial(int num1){
        long factorial1 = 1;
        for(int i=1; i<=num1; i++){
            factorial1 *= i;
        }
        return factorial1;
    }

    public static double num2Factorial(int num2){
        long factorial2 = 1;
        for(int i=1; i<=num2; i++){
            factorial2 *= i;
        }
        return factorial2;
    }

    public static void divideOfFactorials(int num1, int num2){
        double fac1 = (double)num1Factorial(num1);
        double fac2 = (double)num2Factorial(num2);

        if(num1>num2){
            double result = fac1/fac2;
            System.out.printf("%.2f",result);
        }else {
            double result = fac2/fac1;
            System.out.printf("%.2f",result);
        }
    }
}
