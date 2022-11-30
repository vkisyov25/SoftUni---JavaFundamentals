package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PS02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(element ->Integer.parseInt(element)).collect(Collectors.toList());
        int sum = 0;
        int length = list.size();
        for(int i=0; i<length/2; i++){
            sum = list.get(i) + list.get(list.size()-1);

            list.set(i,sum);
            list.remove(list.size()-1);
        }

        for (int j=0; j<list.size(); j++){
            System.out.print(list.get(j)+" ");
        }
    }
}
