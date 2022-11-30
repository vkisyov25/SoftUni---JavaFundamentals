package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PS006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element -> Integer.parseInt(element)).toArray();

        int leftSum =0;
        int rightSum =0;
        boolean isHave = true;

        for(int i=0; i< arr.length; i++){
            for(int k=0; k<i; k++){
                leftSum +=arr[k];
            }
            for(int p=i+1; p< arr.length; p++){
                rightSum +=arr[p];
            }

            if(leftSum == rightSum){
                isHave = false;
                System.out.print(i);
            }
            leftSum =0;
            rightSum =0;
        }
        if(isHave){
            System.out.print("no");
        }
    }
}
