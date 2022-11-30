package DataTypesAndVariables;

import java.util.Scanner;

public class PS0010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        byte Y = Byte.parseByte(scanner.nextLine());

        //int subtraction=0;
        byte count =0;
        int NN = N;

        while (N>M){
            count++;
            N = N - M;

            if(N==NN/2 ){
                N /=Y;
            }

        }

        System.out.println(N);
        System.out.println(count);
    }
}
