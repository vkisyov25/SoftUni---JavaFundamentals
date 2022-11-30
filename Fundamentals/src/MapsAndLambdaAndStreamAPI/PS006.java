package MapsAndLambdaAndStreamAPI;

import java.util.*;

public class PS006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,List<String>> ventsy = new LinkedHashMap<>();

        List<String> personList = new ArrayList<>();

        String line = scanner.nextLine();

        String lastCourse="";

        while (!line.equals("end")){
            String[] arr = line.split(":");

            String courseName = arr[0];
            String personName = arr[1];

            if(ventsy.get(courseName)==null){
                ventsy.put(courseName, new ArrayList<>());
            }
            ventsy.get(courseName).add(personName);

            line = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : ventsy.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue().size());
            //System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            for (int i =0; i<entry.getValue().size(); i++){
                System.out.printf("--%s%n",entry.getValue().get(i));
            }
        }

    }
}
