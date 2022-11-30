package Arrays;

import java.util.Scanner;

public class PS01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int num = Integer.parseInt(scanner.nextLine());

        if(num>0 && num<=7){
            System.out.print(days[num-1]);
        }
        else{
            System.out.print("Invalid day!");
        }
    }
}