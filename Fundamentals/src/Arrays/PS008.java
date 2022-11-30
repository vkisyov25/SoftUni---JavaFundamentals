package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PS008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element ->Integer.parseInt(element)).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if (arr[i]+arr[j] == magicNum){
                    System.out.printf("%d %d%n",arr[i],arr[j]);
                }
            }
        }
    }
}
