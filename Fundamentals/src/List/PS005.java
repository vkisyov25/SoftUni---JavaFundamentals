package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PS005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" ")).map(element -> Integer.parseInt(element)).collect(Collectors.toList());

        String[] line =scanner.nextLine().split(" ");
        int specialNum = Integer.parseInt(line[0]);
        int power = Integer.parseInt(line[1]);

        int index = 0;
        int count = 0;

        while (list1.contains(specialNum)){
            proverki(list1, specialNum, power, index, count);
        }

        printListAndGetSum(list1);


    }

    private static void proverki(List<Integer> list1, int specialNum, int power, int index, int count) {
        for(int i = 0; i< list1.size(); i++){
            if(list1.get(i)== specialNum){
                index = i;
            }
        }

        if(index - power >=0 && index + power < list1.size()){
            for(int j = index - power; j< index + power; j++){
                count++;
                list1.remove(j);
                j--;
                if(count == (power *2) +1){
                    break;
                }
            }
        } else if (index - power <0 && index + power < list1.size()) {
            for(int j = 0; j< index + power; j++){
                count++;
                list1.remove(j);
                j--;
                if(count == (power *2) +1){
                    break;
                }
            }
        } else if (index - power >=0 && index + power > list1.size()) {
            for(int j = index - power; j< list1.size(); j++){
                count++;
                list1.remove(j);
                j--;
                if(count == (power *2) +1){
                    break;
                }
            }
        }
    }

    private static void printListAndGetSum(List<Integer> list1) {
        int sum = 0;
        for (int v = 0; v< list1.size(); v++){
            //System.out.print(list1.get(v)+" ");
            sum += list1.get(v);
        }
        //System.out.println();
        System.out.println(sum);
    }
}
