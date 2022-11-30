package Methods;

import java.util.Scanner;

public class PS005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractOfSumAndNum2(num1,num2,num3));

    }
    public static int getSumOfNum1AndNum2(int num1, int num2){
        return num1 + num2;
    }

    public static int subtractOfSumAndNum2(int num1, int num2, int num3){
        int sum = getSumOfNum1AndNum2(num1,num2);
        int result = sum - num3;
        return result;
    }
}
