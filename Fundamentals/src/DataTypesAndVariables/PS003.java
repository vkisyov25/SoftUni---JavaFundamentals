package DataTypesAndVariables;

import java.util.Scanner;

public class PS003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int coures =(int)Math.ceil((double) n/p);

        System.out.println(coures);

    }
}
