package MapsAndLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PS005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> cars = new LinkedHashMap<>();

        int num = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<num; i++){
            String[] arr = scanner.nextLine().split(" ");

            String command = arr[0];
            String name = arr[1];

            if(command.equals("register")){
                String carNum = arr[2];

                if(cars.get(name)== null){
                   carNum=carNum;
                    System.out.printf("%s registered %s successfully%n",name,carNum);
                    cars.put(name,carNum);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n", cars.get(name));
                }
                //cars.put(command,carNum);
            }else {
                if(cars.get(name)== null){
                    System.out.printf("ERROR: user %s not found%n",name);

                }else {
                    System.out.printf("%s unregistered successfully%n", name);
                    cars.remove(name);
                }

            }
        }
        for (Map.Entry<String, String> entry : cars.entrySet()) {
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }

    }

}
