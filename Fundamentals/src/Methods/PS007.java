package Methods;

import java.util.Scanner;

public class PS007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        matrix(n);
    }

    public static void matrix(int num){
        int[][] matrixArr = new int[num][num];

        for(int i=0; i<num; i++){
            for (int j=0; j<num; j++){
                System.out.printf("%d ",num);
            }
            System.out.println();
        }
    }
}
