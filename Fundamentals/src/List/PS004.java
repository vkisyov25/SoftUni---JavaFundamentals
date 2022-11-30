package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PS004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int commandNum = Integer.parseInt(scanner.nextLine());
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(element -> Integer.parseInt(element)).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String[] arr = line.split(" ");
            String command = arr[0];

            if (command.equals("Add")) {
                int num = Integer.parseInt(arr[1]);

                list.add(num);
            } else if (command.equals("Insert")) {
                int num = Integer.parseInt(arr[1]);
                int index = Integer.parseInt(arr[2]);
                if (index>list.size()){
                    System.out.println("Invalid index");
                }else {
                    list.add(index, num);
                }

            } else if (command.equals("Shift")) {
                String command1 = arr[1];

                if (command1.equals("left")) {
                    int count = Integer.parseInt(arr[2]);

                    for (int i = 0; i < count; i++) {
                        int num = list.get(0);
                        list.add(num);
                        list.remove(0);
                    }

                } else if (command1.equals("right")) {
                    int count = Integer.parseInt(arr[2]);

                    for (int i = 0; i < count; i++) {
                        int num = list.get(list.size() - 1);
                        list.add(0, num);
                        list.remove(list.size() - 1);

                    }

                }

            }else if (command.equals("Remove")) {
                int index = Integer.parseInt(arr[1]);
                if (index>list.size()){
                    System.out.println("Invalid index");
                }else {
                    list.remove(index);
                }

            }
            line = scanner.nextLine();
        }
        printList(list);
    }

    private static void printList(List<Integer> list) {
        for (int j = 0; j< list.size(); j++){
            System.out.print(list.get(j)+" ");
        }
    }
}