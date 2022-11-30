package MapsAndLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PS02ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // contest -> <name -> points>
        Map<String,Map<String,Integer>> one = new LinkedHashMap<>();
        //<name -> points>
        Map<String,Integer> nameAndPoints = new TreeMap<>();

        String line = scanner.nextLine();

        while (!line.equals("no more time")){
            String[] arr = line.split(" -> ");
            String userName = arr[0];
            String contest = arr[1];
            int points = Integer.parseInt(arr[2]);

            //Map<String,Integer> nameAndPoints = new TreeMap<>();

            if(!one.containsKey(contest)){
                nameAndPoints = new TreeMap<>();
                Integer currentPoints = nameAndPoints.get(userName);
                if(currentPoints == null){
                    currentPoints=0;
                }
                nameAndPoints.put(userName,currentPoints+points);

                one.put(contest,nameAndPoints);

            }else {
               // Map<String,Integer> nameAndPoints = new TreeMap<>();

                if(!one.containsValue(userName)){
                    nameAndPoints.put(userName,points);
                }else {
                    if(nameAndPoints.get(userName)>points){
                        nameAndPoints.put(userName,points);
                    }else {
                        nameAndPoints.put(userName,nameAndPoints.get(userName));
                    }
                }

                one.put(contest,nameAndPoints);
            }

            line = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> entry : one.entrySet()) {
            System.out.printf("%s: %d participants%n",entry.getKey(),entry.getValue().size());
            for (int i=0; i<entry.getValue().size(); i++){
                //System.out.printf("%d. %s <::> %d",i,entry.getKey(nameAndPoints),entry.getValue().get(i));

            }
        }

        nameAndPoints.entrySet().stream()
                .sorted((f,s) ->{
                    int result = s.getValue().compareTo(f.getValue());
                    return result;
        });


    }
}
