package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //createList(scanner);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" ")).map(element -> Integer.parseInt(element)).collect(Collectors.toList());
    }

    private static void createList(Scanner scanner) {
        String[] line = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i =0; i< line.length; i++){
            int number = Integer.parseInt(line[i]);
            list.add(number);
        }

        for (int j=0; j<list.size(); j++){
            System.out.print(list.get(j) + " ");
        }
    }
}
