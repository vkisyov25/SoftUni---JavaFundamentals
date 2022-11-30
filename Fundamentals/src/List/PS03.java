package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PS03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" ")).map(element -> Integer.parseInt(element)).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" ")).map(element -> Integer.parseInt(element)).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        if(list1.size()>list2.size()){
            for (int i=0; i< list1.size();i++){
                resultList.add(list1.get(i));
                if(i<list2.size()){
                    resultList.add(list2.get(i));
                }
            }
        }else {
            for (int i=0; i< list2.size();i++){
                if(i<list1.size()){
                    resultList.add(list1.get(i));
                }
                resultList.add(list2.get(i));
            }
        }

        for (int j=0; j< resultList.size();j++){
            System.out.print(resultList.get(j)+" ");
        }


    }
}
