package review;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        wordsArr = Arrays.stream(wordsArr)
                .filter(w -> w.length()%2==0)
                .toArray(String[]::new);

        /*Arrays.stream(wordsArr).filter(w->w.length() %2==0)
                .forEach(person -> System.out.println(person.toString()));*/

        System.out.println(String.join(",",wordsArr));
    }
}
