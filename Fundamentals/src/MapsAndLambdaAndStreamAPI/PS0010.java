package MapsAndLambdaAndStreamAPI;

import java.util.*;

public class PS0010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> peopleRes = new LinkedHashMap<>(); // name -> points
        Map<String,Integer> submits = new LinkedHashMap<>();   // language -> count

        String line = scanner.nextLine();

        while (!line.equals("exam finished")){
            String[] arr = line.split("-");

            String name = arr[0];
            String language = arr[1];
            if(language.equals("banned")){
                peopleRes.remove(name);
                line = scanner.nextLine();
                continue;
            }
            Integer currentPoints = Integer.parseInt(arr[2]);


            Integer points = peopleRes.get(name);
            if(points == null){
                points=0;
            }
            int maxPoints =0;
            if(points>=currentPoints){
                maxPoints = points;
            }
            else {
                maxPoints = currentPoints;
            }

            peopleRes.put(name,maxPoints);

            Integer s = submits.get(language);
            if(s==null){
                s =0;
            }
            submits.put(language,s+1);



            line = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : peopleRes.entrySet()) {
            System.out.println(String.format("%s | %d",entry.getKey(), entry.getValue()));
        }

        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : submits.entrySet()) {
            System.out.println(String.format("%s - %d",entry.getKey(), entry.getValue()));
        }

    }
}
