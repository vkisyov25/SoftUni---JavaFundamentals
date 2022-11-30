package MapsAndLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> ventsy = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("stop")){
            int num = Integer.parseInt(scanner.nextLine());

            Integer currentNum = ventsy.get(command);
            if (currentNum == null){
                currentNum =0;
            }
            ventsy.put(command,currentNum+num);


            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : ventsy.entrySet()) {
            System.out.println(entry.getKey()+" -> "+ entry.getValue());
        }

    }
}
