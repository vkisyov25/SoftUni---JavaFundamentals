package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PS03ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordList = new ArrayList<>();

        String[] textArr = scanner.nextLine().split("\\|");

        String part1 = textArr[0];
        String part2 = textArr[1];
        String part3 = textArr[2];

        String expression1 ="([#$%&*])([A-Z]+)(\\1)";
        Pattern pattern1 = Pattern.compile(expression1);
        Matcher matcher1 = pattern1.matcher(part1);

        StringBuilder sb1 = new StringBuilder();
        while (matcher1.find()){;
            sb1.append(matcher1.group(2));
        }

        String expression2 ="(?<one>\\d\\d):(?<two>\\d\\d)";
        Pattern pattern2 = Pattern.compile(expression2);
        Matcher matcher2 = pattern2.matcher(part2);


        while (matcher2.find()){
            char letter = (char) Integer.parseInt(matcher2.group("one"));
            int length = Integer.parseInt(matcher2.group("two"));
            length = length+1;

            boolean isHave = false;
            for(int i=0; i<sb1.length(); i++){
                if(sb1.charAt(i)==letter){
                    isHave = true;
                    break;
                }
            }

            if(isHave){
                String[] arr = part3.split(" ");
                for (int j=0; j< arr.length; j++){
                    String word = arr[j];
                    if(word.charAt(0)==letter && arr[j].length()==length){
                       // if(!wordList.contains(arr[j])){
                            wordList.add(arr[j]);
                        //}
                    }
                }
            }
        }

        for(int k=0; k<wordList.size(); k++){
            for (int p=k+1; p<wordList.size(); p++){
                if(wordList.get(k).equals(wordList.get(p))){
                    wordList.remove(wordList.get(k));
                }
            }
        }
        System.out.println(String.join("\n",wordList));
    }
}
