package DataTypesAndVariables;

import java.util.Scanner;

public class PS006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i=97; i<97+n; i++){
            for (int j=97; j<97+n; j++){
                for (int k=97; k<97+n; k++){
                    System.out.printf("%c%c%c%n",i,j,k);
                }
            }
        }
    }
}
