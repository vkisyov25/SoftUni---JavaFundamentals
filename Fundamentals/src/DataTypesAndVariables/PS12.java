package DataTypesAndVariables;

import java.util.Scanner;

public class PS12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int num = 0;
        boolean  isSpecialNum = false;
        for (int i = 1; i <= number; i++) {
            num = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
             isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", num,  isSpecialNum);
            sum = 0;
            i = num;
        }

    }
}
