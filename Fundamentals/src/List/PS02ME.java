package List;

import java.util.Arrays;
import java.util.Scanner;

public class PS02ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element -> Integer.parseInt(element)).toArray();
        //int[] arr2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element -> Integer.parseInt(element)).toArray();
        double sum1=0;
        double sum2=0;
        for (int i=0; i<arr1.length/2; i++){
            if(arr1[i] != 0){
                sum1 += arr1[i];
            }else {
                sum1 -= (0.20*sum1);

            }
        }

        for (int j=arr1.length-1; j>arr1.length/2; j--){
            if(arr1[j] != 0){
                sum2 += arr1[j];
            }else {
                sum2 -= (0.20*sum2);

            }
        }


        printFinalResult(sum1, sum2);
    }

    private static void printFinalResult(double sum1, double sum2) {
        if(sum1 < sum2){
            System.out.printf("The winner is left with total time: %.1f", sum1);
        }else {
            System.out.printf("The winner is right with total time: %.1f", sum2);
        }
    }
}
