package DataTypesAndVariables;

import java.util.Scanner;

public class PS009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int countDays = 1;
        int total;
        int totall = 0;

        while (true){
            total = startingYield - 26;
            startingYield -=10;
            totall += total;

            if(startingYield<100){
                totall -= 26;
                System.out.println(countDays);
                System.out.println(totall);

                break;
            }
            countDays++;

        }
    }
}
