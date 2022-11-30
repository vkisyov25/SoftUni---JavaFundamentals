package Arrays;

import java.util.Scanner;

public class PS02ME {
    public static void main(String[] args) {
        //false
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<num; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
