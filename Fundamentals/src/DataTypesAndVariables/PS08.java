package DataTypesAndVariables;

import java.util.Scanner;

public class PS08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);

        if (symbol>=97 && symbol<=122){
            System.out.println("lower-case");
        } else if (symbol>=65 && symbol<=90) {
            System.out.println("upper-case");
        }
    }
}
