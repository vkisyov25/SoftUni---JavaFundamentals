package DataTypesAndVariables;

import java.util.Scanner;

public class PS02ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String rightNumm ="";
        String leftNumm ="";

        double sumDigitsLqvo=0;
        double sumDigitsDqsno=0;

        for (int i=0; i<num; i++){
            String currentNum = scanner.nextLine();
            for (int j=0; j<currentNum.length(); j++)
                if(currentNum.charAt(j) != ' '){
                    rightNumm += currentNum.charAt(j);

                }else{
                    leftNumm = rightNumm;

                    rightNumm ="";

                }

                double lqvo = Double.parseDouble(leftNumm);
                double dqsno = Double.parseDouble(rightNumm);

                if (lqvo > dqsno){
                    for(int k=0; k<leftNumm.length(); k++){
                        double Digits1 = lqvo % 10;
                        sumDigitsLqvo += Digits1;
                        lqvo /=10;

                    }
                    System.out.println(sumDigitsLqvo);
                }
                else {
                    for(int k=0; k<rightNumm.length(); k++){
                        double Digits2 = dqsno % 10;
                        sumDigitsDqsno += Digits2;
                        dqsno /=10;

                    }
                    System.out.println(sumDigitsDqsno);
                }

                sumDigitsDqsno =0;
                sumDigitsLqvo = 0;

                //convert from string to int
                rightNumm ="";
                leftNumm = "";

        }
    }
}
