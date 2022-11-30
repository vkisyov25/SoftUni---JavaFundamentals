package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PS006 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String text = scanner.nextLine();
        String expression ="(?<email>(^|(?<=\\s))([A-Za-z0-9]+([\\.\\-_]?)([A-Za-z0-9]+))@([a-zA-Z]+([\\.\\-][A-Za-z]+)+)(\\b|(?<=\\s)))";

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group("email"));
        }
    }
}
