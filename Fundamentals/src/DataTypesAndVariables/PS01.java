package DataTypesAndVariables;

import java.util.Scanner;

public class PS01 {
    public static void main(String[] args) {
        int metres = new Scanner(System.in).nextInt();
        double inKm = (double)metres/1000;
        System.out.printf("%.2f",inKm);
    }
}
