package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS01Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String text = scanner.nextLine();

        int currentIndex =0;
        int nextIndex = text.indexOf(word,currentIndex);
        //int nextIndexxx =0;

        List<String> list = new ArrayList<>();

        while (nextIndex != -1){
            list.add(text.substring(currentIndex,nextIndex));
            currentIndex = nextIndex + word.length();
            //nextIndexxx = text.indexOf(word);
            nextIndex = text.indexOf(word,currentIndex);
        }
        list.add(text.substring(currentIndex,text.length()));

        printList(list);

    }

    private static void printList(List<String> list) {
        for (int i = 0; i< list.size(); i++){
            System.out.print(list.get(i));
        }
    }
}
