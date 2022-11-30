package Methods;

import java.util.Scanner;

public class PS02 {
    public static void grade(double n){
        if(n>=2.0 &&n<=2.99){
            System.out.println("Fail");
        } else if (n>=3.0 &&n<=3.49) {
            System.out.println("Poor");
        } else if (n>=3.50 &&n<=4.49) {
            System.out.println("Good");
        } else if (n>=4.50 &&n<=5.49) {
            System.out.println("Very good");
        } else if (n>=5.50 &&n<=6.00) {
            System.out.println("Excellent");
        }
    }

    public static void main(String[] args) {
        double gradeNum = new Scanner(System.in).nextDouble();
        grade(gradeNum);
    }


}
