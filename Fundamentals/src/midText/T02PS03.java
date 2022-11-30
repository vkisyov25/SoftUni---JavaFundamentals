package midText;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02PS03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<Integer> list = Arrays.stream(text.split("@")).map(e ->Integer.parseInt(e)).collect(Collectors.toList());
        String line = scanner.nextLine();


        int index=0;
        while (!line.equals("Love!")){
            String[] arr = line.split(" ");

            String command = arr[0];
            int num = Integer.parseInt(arr[1]);
            index += num;
            //if(index<list.size()){
            //    if(list.get(index)==0){
            //        System.out.printf("Place %d already had Valentine's day.%n",index);
            //        continue;
            //    }
            //}

            if(index>= list.size()){
                index=0;
                if(list.get(index)==0){
                    System.out.printf("Place %d already had Valentine's day.%n",index);
                    line = scanner.nextLine();
                    continue;
                }else {
                    list.set(index, list.get(index)-2);
                }
            }else {
                list.set(index, list.get(index)-2);
            }

            if(list.get(index)==0){
                System.out.printf("Place %d has Valentine's day.%n",index);
            }





            line = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n",index);
        int count=0;
        for (int i=0; i<list.size(); i++){
            if(list.get(i)==0){
                count++;
            }
        }
        if(count==list.size()){
            System.out.println("Mission was successful.");
        }else {
            System.out.printf("Cupid has failed %d places.%n",list.size()-count);
        }
    }
}
