package MapsAndLambdaAndStreamAPI;

import java.util.*;

public class PS007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();

        int nLines = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<nLines; i++){
            String name = scanner.nextLine();
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if(students.get(name)==null){
                students.put(name,new ArrayList<>());
            }

            students.get(name).add(currentGrade);
        }

        students.entrySet()
                .stream()
                .filter(s -> s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble()>=4.50)
                /*.sorted((f,s) -> {
                    double firstAv = f.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();

                    double secondAv = s.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();

                    return  Double.compare(secondAv,firstAv);
                })*/
                .forEach(s -> System.out.printf("%s -> %.2f%n",s.getKey(),s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble()));



    }
}
