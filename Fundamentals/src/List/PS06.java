package List;

import java.util.*;

public class PS06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            String product = scanner.nextLine();
            list.add(product);
        }

        Collections.sort(list);
        int v=1;
        for (int j=0; j<list.size(); j++){

            System.out.printf("%d.%s%n",v,list.get(j));
            v++;
        }


    }
}
