package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class PS01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        Random randomGenerator = new Random();

        for (int i=0; i< arr.length; i++){
            int x = randomGenerator.nextInt(arr.length);
            int y = randomGenerator.nextInt(arr.length);
            String oldWordsX  = arr[x];
            arr[x] = arr[y];
            arr[y] = oldWordsX;
        }
        System.out.println(String.join(System.lineSeparator(),arr));
    }
}
