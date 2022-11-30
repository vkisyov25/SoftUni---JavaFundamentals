package Methods;

import java.util.Scanner;

public class PS10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        n = Math.abs(n);
        System.out.println(getMultipleOfEvensAndOdds(n));

    }

    public static int getEvenSum(int number) {
        int evenSum = 0;
        int i = 1;
        int digit = number % 10;
        number /= 10;
        while (number != 0) {
            if (i % 2 == 0 ) {
                evenSum += digit;
            }
            i++;
            digit = number % 10;
            number /= 10;
        }
        if (i % 2 == 0) {
            evenSum += digit;
        }


        return evenSum;
    }

    public static int getOddSum(int number) {
        int oddSum = 0;
        int i = 1;
        int digit = number % 10;
        number /= 10;
        while (number != 0) {
            if (i % 2 != 0) {
                oddSum += digit;
            }
            i++;
            digit = number % 10;
            number /= 10;
        }
        if (i % 2 != 0) {
            oddSum += digit;
        }
        return oddSum;
    }
    public static  int getMultipleOfEvensAndOdds(int num){
        int evenSum = getEvenSum(num);
        int oddSum = getOddSum(num);

        return evenSum*oddSum;
    }
}
