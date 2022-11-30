package review;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ranking01МЕhard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command1 = scanner.nextLine();
        //contest -> password
        Map<String,String> mapOne = new LinkedHashMap<>();
        while (!command1.equals("end of contests")){
            String[] arr = command1.split(":");

            String contest = arr[0];
            String password = arr[1];

            mapOne.put(contest,password);


            command1 = scanner.nextLine();
        }

        String command2 = scanner.nextLine();
        //name -> <contest -> points>
        Map<String,Map<String,Integer>> users = new TreeMap<>();
        //<contest -> points>
        Map<String,Integer> mapTwo = new TreeMap<>();
        while (!command2.equals("end of submissions")){
            String[] arr1 = scanner.nextLine().split("=>");
            String contest1 = arr1[0];
            String password1 = arr1[1];

            String personName = arr1[2];
            int points = Integer.parseInt(arr1[3]);


                if(mapOne.containsKey(contest1)&& mapOne.containsValue(password1)) {
                    Integer allPoints = mapTwo.get(contest1);
                    if(allPoints ==null){
                        allPoints=0;
                    }
                    allPoints = points;
                    mapTwo.put(contest1,allPoints);


                }

                //users.put(personName,mapTwo);
            if (!users.containsKey(personName)) {
                users.put(personName, mapTwo);
            } else {
                if (!users.get(personName).containsKey(contest1)) {
                    users.get(personName).put(contest1, points);
                } else {
                    users.get(personName).put(contest1, Math.max(points, users.get(personName).get(contest1)));
                }
            }

            mapTwo = new TreeMap<>();

            command2 = scanner.nextLine();
        }

    }

}
