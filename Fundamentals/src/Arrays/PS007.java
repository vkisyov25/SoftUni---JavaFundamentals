package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PS007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element -> Integer.parseInt(element)).toArray();


        int count=0;

        int maxNum = Integer.MIN_VALUE;
        int num = 0;

        for (int i=0; i<arr.length; i++){
            //count +=1;
            while(i != arr.length-1){
                if(arr[i]==arr[i+1]){
                    count++;
                }
                else {
                    count = 0;
                }
                if(count>maxNum){
                    maxNum = count;
                    num = arr[i];

                }

                i++;
            }

        }
        //System.out.print(maxNum+1);
        //System.out.println();

        for (int j=0; j<maxNum +1; j++){
            System.out.print(num +" ");
        }
    }
}
