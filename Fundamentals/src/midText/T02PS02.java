package midText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02PS02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list =Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("Go Shopping!")){
            String[] arr = line.split(" ");
            String command = arr[0];

            if(command.equals("Urgent")){
                if(list.contains(arr[1])){
                    line = scanner.nextLine();
                    continue;
                }else {
                    String vv = arr[1];
                    list.remove(arr[1]);
                    list.add(0,arr[1]);
                }

            } else if (command.equals("Unnecessary")) {
                if(list.contains(arr[1])){
                    list.remove(arr[1]);
                }

            } else if (command.equals("Correct")) {
                if(list.contains(arr[1])){
                    list.set(list.indexOf(arr[1]),arr[2]);
                }
            } else if (command.equals("Rearrange")) {
                if(list.contains(arr[1])){
                    String v = arr[1];
                    list.remove(arr[1]);
                    list.add(arr[1]);
                }
            }

            line = scanner.nextLine();
        }

        for(int i=0; i<list.size(); i++){
            if(i<list.size()-1){
                System.out.print(list.get(i)+", ");
            }else {
                System.out.print(list.get(i));
            }
        }
    }
}
