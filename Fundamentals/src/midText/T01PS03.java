package midText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T01PS03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("Craft!")){

            String[] arr = line.split(" - ");
            String command = arr[0];

            if(command.equals("Collect")){
                if(list.contains(arr[1])){
                    continue;
                }else {
                    list.add(arr[1]);
                }
                
            } else if (command.equals("Drop")) {
                if(list.contains(arr[1])){
                    list.remove(arr[1]);
                }
            } else if (command.equals("Combine Items")) {
                String[] arr1 = arr[1].split(":");
                if(list.contains(arr1[0])){
                    int v = list.indexOf(arr1[0]) + 1;
                    if(v>=list.size()){
                        list.add(arr1[1]);
                    }else {
                        list.add(list.indexOf(arr1[0] + 1), arr1[1]);
                    }
                }
            } else if (command.equals("Renew")) {
                if(list.contains(arr[1])){
                    String e = arr[1];
                    list.remove(arr[1]);
                    list.add(e);
                }
            }


            line = scanner.nextLine();
        }


        //System.out.println(list);
        for(int i=0; i<list.size(); i++){
            if(i<list.size()-1){
                System.out.print(list.get(i)+", ");
            }else {
                System.out.print(list.get(i));
            }
        }


    }
}
