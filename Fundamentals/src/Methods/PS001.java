package Methods;

import java.util.Scanner;

public class PS001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        System.out.println(maxNum(num1,num2,num3));
    }

    public static int maxNum(int num1,int num2,int num3){
        int minNum = 0;
        if(num1<num2){
            minNum = num1;
        }
        else{
            minNum= num2;
        }
        if(minNum<num3){
            minNum = minNum;
        }
        else {
            minNum = num3;
        }
        return minNum;
    }
}
