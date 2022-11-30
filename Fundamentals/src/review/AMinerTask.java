package review;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> ventsy = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("stop")){
            int number = Integer.parseInt(scanner.nextLine());

            Integer isHave = ventsy.get(command);
            if(isHave==null){
                isHave=0;
            }
            ventsy.put(command,isHave+number);

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : ventsy.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
