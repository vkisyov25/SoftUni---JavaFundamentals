package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PS005 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
         int[] arr1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element -> Integer.parseInt(element)).toArray();

         int[] arr2 = new int[arr1.length];

         for(int i=0; i< arr1.length; i++){
             while(i != arr1.length-1){
                 if(arr1[i]>arr1[i+1]){
                     arr2[i]=arr1[i];
                 }
                 i++;
             }
                arr2[i]=arr1[i];

        }

        for (int k=0; k< arr2.length; k++){
            if(arr2[k] !=0){
                System.out.print(arr2[k]+" ");
            }
        }

    }
}
