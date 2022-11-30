package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PS07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(element ->Integer.parseInt(element)).collect(Collectors.toList());
        //boolean isHave = false;
        for (int i=0; i<list.size(); i++){
            if(list.get(i)<0){
                list.remove(i);
                i--;
            }
        }

        if(list.size()==0){
            System.out.println("empty");
        }else {
            for (int j= list.size()-1; j>=0; j--){
                System.out.print(list.get(j)+" ");
            }

        }
    }
}
