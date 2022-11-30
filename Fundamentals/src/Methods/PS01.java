package Methods;

import java.util.Scanner;

public class PS01 {
    public static void printSign(int n){
        if(n==0){
            System.out.printf("The number 0 is zero.",n);
        } else if (n<0) {
            System.out.printf("The number %d is negative.",n);
        } else if (n>0) {
            System.out.printf("The number %d is positive.",n);
        }

    }
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        printSign(num);
    }
}
