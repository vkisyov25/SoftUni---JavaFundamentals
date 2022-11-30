package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" ")).map(element -> Integer.parseInt(element)).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("end")){
            String[] arr = line.split(" ");
            String command = arr[0];

            if(command.equals("Delete")){
                int num = Integer.parseInt(arr[1]);
                for (int i=0; i< list1.size(); i++){
                    if(list1.get(i) ==num){
                        list1.remove(list1.get(i));
                        i--;
                    }
                }
            } else if (command.equals("Insert")) {
                int num =Integer.parseInt(arr[1]);
                int index =Integer.parseInt(arr[2]);
                list1.add(index,num);
            }


            line = scanner.nextLine();
        }

        printList(list1);

    }

    private static void printList(List<Integer> list1) {
        for (int j = 0; j< list1.size(); j++){
            System.out.print(list1.get(j)+" ");
        }
    }
}
