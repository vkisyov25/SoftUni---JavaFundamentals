package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PS004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 =Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element ->Integer.parseInt(element)).toArray();

        int[] arr2 = new int[arr1.length];
        int n = Integer.parseInt(scanner.nextLine());

        if(n > arr1.length){
            n = n- arr1.length;
        }

        for (int i=n; i< arr1.length; i++){
            arr2[i-n] = arr1[i];
        }

        for (int j=0; j< n; j++){
            arr2[arr2.length-n +j] = arr1[j];
        }

        for(int v=0; v< arr2.length; v++){
            System.out.print(arr2[v]+ " ");
        }
    }
}
