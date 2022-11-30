package RegularExpressions;

import java.awt.image.ComponentSampleModel;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PS01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.printf("%s ",matcher.group());
        }
    }
}
