package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PS001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" ")).map(element -> Integer.parseInt(element)).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        while (!line.equals("end")){
            String[] arr = line.split(" ");
            String command = arr[0];

            if(command.equals("Add")){
                int num = Integer.parseInt(arr[1]);
                list1.add(num);
            }else {
                int num = Integer.parseInt(arr[0]);
                for (int i=0; i< list1.size(); i++){
                    int sum = num+list1.get(i);
                    if(sum<=maxCapacity){
                        list1.set(i,sum);
                        break;
                    }
                }
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
