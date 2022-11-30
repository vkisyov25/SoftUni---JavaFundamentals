package DataTypesAndVariables;

import java.util.Scanner;

public class PS001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int four = Integer.parseInt(scanner.nextLine());

        int sum = ((first + second)/third)*four;

        System.out.println(sum);
    }
}