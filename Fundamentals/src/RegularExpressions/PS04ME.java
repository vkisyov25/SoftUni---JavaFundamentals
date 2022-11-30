package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PS04ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String message = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        StringBuilder sb555 = new StringBuilder();

        while (!message.equals("end")){

            for (int i=0; i<message.length(); i++){
                int letterIndex = message.charAt(i) - num;
                sb.append((char) letterIndex);
                sb555.append((char) letterIndex);
            }


            String expression1 ="(@(?<name>[A-Za-z]+))";
            Pattern pattern1 = Pattern.compile(expression1);
            Matcher matcher1 = pattern1.matcher(sb);

            String expression2 ="(!([GN])!)";
            Pattern pattern2 = Pattern.compile(expression2);
            Matcher matcher2 = pattern2.matcher(sb);

            String text555 = sb555.toString();
            if(matcher2.find()){
                String replace = text555.replace(matcher2.group(1), "");
                while (matcher1.find()){
                    replace = replace.replace(matcher1.group(1), "");
                    if(replace.contains("@")||replace.contains("-")|| replace.contains("!")|| replace.contains(":")|| replace.contains(">")){
                        break;
                    }
                    if(matcher2.group(2).equals("G")){
                        System.out.println(matcher1.group("name"));
                    }
                }
            }

            message = scanner.nextLine();
            sb = new StringBuilder();
            sb555 = new StringBuilder();
        }
    }
}
