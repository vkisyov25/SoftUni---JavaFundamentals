package List;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PS01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> list = Arrays.stream(scanner.nextLine().split(" ")).map(element ->Double.parseDouble(element)).collect(Collectors.toList());
        double sum =0.0;
        boolean search = true;
        while(search){
            search = false;
            for (int i=0; i<list.size()-1; i++){
                if(list.get(i).equals(list.get(i + 1))){
                    search = true;
                    sum = list.get(i)+list.get(i+1);
                    list.remove(i);
                    list.set(i,sum);
                    break;
                }
            }
        }

        printList(list);

    }

    private static void printList(List<Double> list) {
        for (int j = 0; j< list.size(); j++){
            //int ventsy = Integer.parseInt(new DecimalFormat("0.#").format(list.get(j)));
            //System.out.print(ventsy+" ");
            System.out.print(list.get(j) + " ");
        }
    }
}
