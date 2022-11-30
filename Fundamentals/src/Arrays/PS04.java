package Arrays;

import java.util.Scanner;

public class PS04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        String temp=" ";

        for (int i=0; i< arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        //for (int j=0; j< arr.length; j++){
        //    System.out.print(arr[j]+" ");
       // }
       // System.out.println();

        System.out.println(String.join(" ", arr));
    }
}
