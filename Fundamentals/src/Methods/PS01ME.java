package Methods;

import java.util.Scanner;

public class PS01ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String input = scanner.nextLine();
        switch (command){
            case "int":
                int inp = Integer.parseInt(input);
                multiplyBy2 (inp);
                break;
            case "real":
                double num = Double.parseDouble(input);
                realMultiplyAndFormat (num);
                break;
            case "string":
                stringFormattedPrint (input); break;
        }
    }

    private static void multiplyBy2(int inp) {
        inp *= 2;
        System.out.println(inp);
    }

    private static void realMultiplyAndFormat(double num) {
        num *= 1.5;
        System.out.printf("%.2f", num);
    }

    private static void stringFormattedPrint(String input) {
        System.out.printf("$%s$",input);
    }
}
