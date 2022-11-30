package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PS02ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = "([\\D]+)([0-9]+)";

        String text = scanner.nextLine();
        text = text.toUpperCase(Locale.ROOT);
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(text);

        String expression1 = "[A-Za-z&@]";
        Pattern pattern1 = Pattern.compile(expression1);
        Matcher matcher1 = pattern1.matcher(text);
        List<String> ventsy = new ArrayList<>();
        while (matcher1.find()){
            ventsy.add(matcher1.group());
        }

        List<String> list = new ArrayList<>();
        String[] arr;
        while (matcher.find()){
            String texttt = matcher.group();

            arr = texttt.split("");
            int number = Integer.parseInt(arr[arr.length-1]);

            for(int i=0; i< number; i++){
                for (int v=0; v<arr.length-1; v++){
                    list.add(arr[v]);
                }
            }

            texttt ="";

        }
        int br=0;
        for (int d=0; d<ventsy.size(); d++){
            //br++;
            for(int z=d+1; z< ventsy.size(); z++){
                String one = ventsy.get(d);
                String two = ventsy.get(z);
                if(ventsy.get(d).equals(ventsy.get(z))){
                    br++;
                }
            }
        }
        System.out.printf("Unique symbols used: %d%n",ventsy.size()-br);
        System.out.println(String.join((""),list));
    }
}
