package MapsAndLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.Scanner;

public class PS04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        Arrays.stream(arr).filter(w->w.length() %2==0)
                          .forEach(person -> System.out.println(person.toString()));

    }
}
