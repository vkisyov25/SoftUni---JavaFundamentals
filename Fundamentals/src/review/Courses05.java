package review;

import java.util.*;

public class Courses05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> ventsy = new LinkedHashMap<>();
        List<String> studentsList = new ArrayList<>();

        while (!command.equals("end")){
            String[] arr = command.split(" : ");
            String courseName = arr[0];
            String studentName = arr[1];

            if (ventsy.get(courseName)==null){
                studentsList = new ArrayList<>();

                studentsList.add(studentName);
                ventsy.put(courseName,studentsList);
            }else {
                for (int i=0; i<ventsy.get(courseName).size(); i++){
                    studentsList.add(ventsy.get(courseName).get(i));
                }
                studentsList.add(studentName);
                ventsy.put(courseName,studentsList);
            }



            command = scanner.nextLine();
            studentsList = new ArrayList<>();
        }

        for (Map.Entry<String, List<String>> entry : ventsy.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            for(int i=0; i<entry.getValue().size(); i++){
                System.out.printf("-- %s%n",entry.getValue().get(i));
            }

        }

    }
}
