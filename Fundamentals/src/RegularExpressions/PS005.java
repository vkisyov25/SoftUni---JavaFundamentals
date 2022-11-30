package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PS005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(", ");

        List<String> wordsList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        double numSum = 0;

        for (int i=0; i<command.length; i++){
            String text = command[i];
            String wordsExpressions = "(?<health>[A-Za-z]+)";
            String numExpressions = "(?<numbers>-*([0-9](\\.[0-9])*))";
            String symbolExpressions = "(?<symbols>[*\\/])";

            Pattern pattern1 = Pattern.compile(wordsExpressions);
            Pattern pattern2 = Pattern.compile(numExpressions);
            Pattern pattern3 = Pattern.compile(symbolExpressions);

            Matcher matcher1 = pattern1.matcher(text);
            Matcher matcher2 = pattern2.matcher(text);
            Matcher matcher3 = pattern3.matcher(text);

            while (matcher1.find()){
                sb.append(matcher1.group("health"));
            }
            while (matcher2.find()){
                numSum += Double.parseDouble(matcher2.group("numbers"));
            }
            while ((matcher3.find())){
                if(matcher3.group("symbols").equals("*")){
                    numSum *=2;
                } else if (matcher3.group("symbols").equals("/")) {
                    numSum /=2;
                }
            }

            int letterSum=0;
            for (int j=0; j<sb.length(); j++){
                letterSum += sb.charAt(j);
            }

            System.out.printf("%s - %d health, %.2f damage%n",text,letterSum,numSum);
            sb = new StringBuilder();
            numSum =0;

        }




    }
}
