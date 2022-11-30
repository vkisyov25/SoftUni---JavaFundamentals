package Methods;

import java.util.Scanner;

public class PS03 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        printTriangle(num);
    }

    public static void printTriangle(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int num = n;
        for (int k=1; k<=n-1; k++){
            //int num = n;
            for (int v=1; v<=num-1; v++){
                System.out.print(v+" ");
            }
            System.out.println();
            num -=1;
        }
    }
}
