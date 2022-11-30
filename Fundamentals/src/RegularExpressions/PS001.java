package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PS001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double sum = 0.0;
        System.out.println("Bought furniture:");
        while (!command.equals("Purchase")){
            String expression =">>(?<name>[A-ZA-z]+)<<(?<money>\\d+(\\.\\d+)?)!(?<quantity>\\d+)";

            Pattern pattern = Pattern.compile(expression);
            Matcher matcher = pattern.matcher(command);


            while (matcher.find()){
                System.out.println(matcher.group("name"));
                sum += Double.parseDouble(matcher.group("money"))*Double.parseDouble(matcher.group("quantity"));
            }


            command = scanner.nextLine();
        }

        System.out.printf("Total money spend: %.2f",sum);
    }
}
