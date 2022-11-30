package Arrays;

import java.util.Scanner;

public class PS02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        int[] array1 = new int[n];

        for (int i=0; i<n; i++){
            //array[i] = Integer.parseInt(scanner.nextLine());
            array[i] = scanner.nextInt();
        }

        for (int j=0; j<n; j++){
            //array1[array.length - 1 - j] = array[j];
            //array[array.length - 1 - j] = array1[j];
            array1[j] = array[array.length - 1 - j];

        }

        for (int v=0; v< array1.length; v++){
            System.out.print(array1[v]+" ");
        }
    }
}
