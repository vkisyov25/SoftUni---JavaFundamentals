package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PS05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" ")).map(element -> Integer.parseInt(element)).collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!line.equals("end")){
            String[] arr = line.split(" ");
            String command = arr[0];


            if(command.equals("Contains")){
                int number = Integer.parseInt(arr[1]);
                if(list1.contains(number)){
                    System.out.println("Yes");
                }else {
                    System.out.println("No such number");
                }
            } else if (command.equals("Print")){
                String evenOrOdd = arr[1];
                if(evenOrOdd.equals("even")){
                    for(int i=0; i< list1.size(); i++){
                        if(list1.get(i) %2 ==0){
                            System.out.print(list1.get(i)+" ");
                        }
                    }
                    System.out.println();
                }else {
                    for(int i=0; i< list1.size(); i++){
                        if(list1.get(i) %2 !=0){
                            System.out.print(list1.get(i)+" ");
                        }
                    }
                    System.out.println();
                }
            } else if (command.equals("Get")) {
                int sum=0;
                for(int i=0; i< list1.size(); i++){
                    sum += list1.get(i);
                }
                System.out.println(sum);
            } else if (command.equals("Filter")) {
                String symbol = arr[1];
                int number = Integer.parseInt(arr[2]);
                if(symbol.equals(">")){
                    for(int i=0; i< list1.size(); i++){
                        if(list1.get(i)>number){
                            System.out.print(list1.get(i)+" ");
                        }
                    }
                    System.out.println();
                } else if (symbol.equals("<")) {
                    for(int i=0; i< list1.size(); i++){
                        if(list1.get(i)<number){
                            System.out.print(list1.get(i)+" ");
                        }
                    }
                    System.out.println();
                } else if (symbol.equals(">=")) {
                    for(int i=0; i< list1.size(); i++){
                        if(list1.get(i)>=number){
                            System.out.print(list1.get(i)+" ");
                        }
                    }
                    System.out.println();
                } else if (symbol.equals("<=")) {
                    for(int i=0; i< list1.size(); i++){
                        if(list1.get(i)<=number){
                            System.out.print(list1.get(i)+" ");
                        }
                    }
                    System.out.println();
                }
            }


            line = scanner.nextLine();
        }
    }
}
