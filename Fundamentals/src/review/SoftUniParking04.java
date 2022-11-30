package review;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> ventsy = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<n; i++){
            String[] arr = scanner.nextLine().split(" ");

            String name = arr[1];


            if(arr[0].equals("register")){

                if(ventsy.get(name)==null){
                    String regNum = arr[2];
                    ventsy.put(name,regNum);
                    System.out.printf("%s registered %s successfully%n",name,ventsy.get(name));
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n",ventsy.get(name));
                }
            }

            if(arr[0].equals("unregister")){
                if(ventsy.get(name)==null){
                    System.out.printf("ERROR: user %s not found%n",name);
                }else {
                    ventsy.remove(name);
                    System.out.printf("%s unregistered successfully%n",name);
                }
            }
        }

        for (Map.Entry<String, String> entry : ventsy.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }

    }
}
