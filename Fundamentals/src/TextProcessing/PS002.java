package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArr = scanner.nextLine().split(" ");
        System.out.println(sumOfWords(textArr[0],textArr[1]));
    }

    public static int sumOfWords (String text1, String text2){

        int sum =0;
        if(text1.length() > text2.length()){
            for (int i=0; i<text1.length(); i++){
                while(i< text2.length()){
                    sum += (text1.charAt(i) * text2.charAt(i));
                    i++;
                }
                sum += text1.charAt(i);
            }
        }else if(text2.length() > text1.length()){
            for (int i=0; i<text2.length(); i++){
                while(i< text1.length()){
                    sum += (text2.charAt(i) * text1.charAt(i));
                    i++;
                }
                sum += text2.charAt(i);
            }
        }else{
            for (int i=0; i<text2.length(); i++){
                sum += (text2.charAt(i) * text1.charAt(i));
            }
        }

        return  sum;
    }
}

