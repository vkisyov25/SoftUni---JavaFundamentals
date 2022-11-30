package DataTypesAndVariables;

import java.util.Scanner;

public class PS10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int num = 0;
        boolean  isSpecialNum = false;
        String ventsy = "";
        for (int i = 1; i <= number; i++) {
            num = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            //isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            if(isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11)){
                isSpecialNum = true;
            }
            if(isSpecialNum==true){
                ventsy = "True";
            }
            else {
                ventsy ="False";
            }

            System.out.printf("%d -> %s%n", num,  ventsy);
            sum = 0;
            i = num;
            isSpecialNum =false;
        }

    }
}
