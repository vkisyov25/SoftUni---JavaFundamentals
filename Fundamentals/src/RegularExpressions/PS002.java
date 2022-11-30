package RegularExpressions;

import java.util.*;

public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(", ");

        String command = scanner.nextLine();

        StringBuilder name = new StringBuilder();
        int sum = 0;

        Map<String,Integer> ventsy = new LinkedHashMap<>();

        while (!command.equals("end of race" )){
            for(int i=0; i<command.length(); i++){
                if(Character.isLetter(command.charAt(i))){
                    name.append(command.charAt(i));
                }else if(Character.isDigit(command.charAt(i))){
                    sum += Integer.parseInt(String.valueOf(command.charAt(i)));
                }
            }

            Integer integer = ventsy.get(name.toString());
            if(integer == null){
                integer = sum;
            }
            if(sum>integer){
                integer=sum;
            }
            ventsy.put(String.valueOf(name),integer);


            command = scanner.nextLine();
            name = new StringBuilder();
            sum = 0;
        }
       // ventsy.entrySet().stream().sorted((e1, e2) -> {
       //     if(e1.getValue()>e2.getValue()){
       //         return e1.getValue();
      //      }else {
      //          return e2.getValue();
      //      }
      //  });

        ventsy
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e1.getValue(), e2.getValue());

                    return sort;
                });

        int i=1;
        for (Map.Entry<String, Integer> entry : ventsy.entrySet()) {
            if(i==1){
                System.out.printf("1st place:%s%n",entry.getKey());
            } else if (i==2) {
                System.out.printf("2nd place:%s%n",entry.getKey());
            }else if(i==3){
                System.out.printf("3rd place:%s%n",entry.getKey());
            }
            i++;
            if(i==4){
                break;
            }
        }

    }

}
