package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PS01ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ticketsArr = scanner.nextLine().split("\\s*,\\s+");
        int countFirstHalf=0;
        int countSecondHalf=0;
        String text="";
        Matcher matcher1 = null;
        Matcher matcher2;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        String letter = null;


        for (int i=0; i< ticketsArr.length; i++){
            int length = ticketsArr[i].length();
            if(ticketsArr[i].length()>=20){
                String expression ="([@#$^])";
                text = ticketsArr[i];

                Pattern pattern = Pattern.compile(expression);

                Matcher matcher = pattern.matcher(text);
                int count=0;
                while (matcher.find()){
                    count++;
                }

                if(count==0){
                    System.out.printf("ticket \"%s\" - no match%n",text);
                    continue;
                }

                for (int j=0; j<length; j++){

                    if (j<length/2){
                        sb1.append(text.charAt(j));
                    } else if (j>=length/2) {
                        sb2.append(text.charAt(j));
                    }
                }
                matcher1 = pattern.matcher(sb1);
                matcher2 = pattern.matcher(sb2);
                while (matcher1.find()){
                    letter = matcher1.group(1);
                    countFirstHalf++;
                }
                while (matcher2.find()){
                    countSecondHalf++;
                }
            }else {
                System.out.println("invalid ticket");
            }

            if(countFirstHalf==countSecondHalf && (countFirstHalf>=6 && countFirstHalf<=9)){
                System.out.printf("ticket \"%s\" - %d%s%n",text,countSecondHalf,letter);
            } else if (countFirstHalf==countSecondHalf && (countFirstHalf>=10)) {
                System.out.printf("ticket \"%s\" - %d%s Jackpot!%n",text,countFirstHalf,letter);
            }
            sb1 = new StringBuilder();
            sb2 = new StringBuilder();
            countFirstHalf=0;
            countSecondHalf=0;
        }
    }
}
