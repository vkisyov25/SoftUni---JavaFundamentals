package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PS02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = "\\+359([- ])2(\\1)\\d{3}(\\1)\\d{4}\\b";
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(text);
        //int count=0;
        List<String> listPhoneNumbers = new ArrayList<>();
        while (matcher.find()){
            //count +=1;
            listPhoneNumbers.add(matcher.group());
        }
        for (int i=0; i<listPhoneNumbers.size(); i++){
            if(i==listPhoneNumbers.size()-1){
                System.out.printf("%s",listPhoneNumbers.get(i));
            }else {
                System.out.printf("%s, ",listPhoneNumbers.get(i));
            }
        }
    }
}
