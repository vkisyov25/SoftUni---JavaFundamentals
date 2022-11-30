package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PS003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double allMoney = 0.0;
        while (!command.equals("end of shift")){
            String expression = "^%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<amount>[0-9]+)\\|[^|$%.]*?(?<money>[0-9]+\\.*[0-9]*)\\$$";

            Pattern pattern = Pattern.compile(expression);
            Matcher matcher = pattern.matcher(command);

            while (matcher.find()){
                double totalPrice = Double.parseDouble(matcher.group("amount")) * Double.parseDouble(matcher.group("money"));
                allMoney += totalPrice;
                System.out.printf("%s: %s - %.2f%n",matcher.group("name"),matcher.group("product"),totalPrice);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",allMoney);
    }
}
