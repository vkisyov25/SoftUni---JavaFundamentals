package review;

import java.util.*;

public class StudentAcademy06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> ventsy = new LinkedHashMap<>();
        List<Double> gradeList = new ArrayList<>();

        for(int i=0; i<num; i++){
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(ventsy.get(name)==null){
                gradeList = new ArrayList<>();
                gradeList.add(grade);
                ventsy.put(name,gradeList);
            }else {
                for(int j=0; j<ventsy.get(name).size(); j++){
                    gradeList.add(ventsy.get(name).get(j));
                }
                gradeList.add(grade);
                ventsy.put(name,gradeList);

            }

            gradeList = new ArrayList<>();
        }

        for (Map.Entry<String, List<Double>> entry : ventsy.entrySet()) {
            double average=0.0;
            for(int i=0; i<entry.getValue().size(); i++){
                average += entry.getValue().get(i);
            }
            average = average / entry.getValue().size();
            if(average>=4.50){
                System.out.printf("%s -> %.2f%n",entry.getKey(),average);
            }
        }

    }
}
