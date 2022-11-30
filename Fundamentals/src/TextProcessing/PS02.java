package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        List<String> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++){
                list.add(arr[i]);
            }
        }

        //printList(list);
        System.out.printf(String.join("",list));
    }

    private static void printList(List<String> list) {
        for (int k = 0; k< list.size(); k++){
            System.out.print(list.get(k));
        }
    }
}

