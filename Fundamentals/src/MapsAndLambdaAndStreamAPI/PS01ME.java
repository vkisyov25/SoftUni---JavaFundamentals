package MapsAndLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PS01ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //contest -> password
        Map<String, String> contests = new LinkedHashMap<>();

        //name -> <contestt -> points>
        TreeMap<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        String line1 = scanner.nextLine();

        while (!line1.equals("end of contests")) {
            String[] arr1 = line1.split(":");
            String contest = arr1[0];
            String password = arr1[1];

            String s = contests.get(contest);
            if (s == null) {
                s = "";
            }
            s = password;
            contests.put(contest, s);


            line1 = scanner.nextLine();
        }
        String line2 = scanner.nextLine();
        while (!line2.equals("end of submissions")) {
            String[] arr2 = line2.split("=>");

            String contestt = arr2[0];
            String pass = arr2[1];
            String name = arr2[2];
            int points = Integer.parseInt(arr2[3]);

            if (contests.containsKey(contestt)) {
                if (contests.get(contestt).equals(pass)) {
                    //contestt -> points
                    LinkedHashMap<String, Integer> course = new LinkedHashMap<>();
                    course.put(contestt, points);


                    if (!users.containsKey(name)) {
                        users.put(name, course);
                    } else {
                        if (!users.get(name).containsKey(contestt)) {
                            users.get(name).put(contestt, points);
                        } else {
                            users.get(name).put(contestt, Math.max(points, users.get(name).get(contestt)));
                        }
                    }
                }

            }


            line2 = scanner.nextLine();
        }

        int totalSum = 0;
        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet()) {
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > totalSum) {
                totalSum = sum;
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet()) {
            if (user.getValue().values().stream().mapToInt(i -> i).sum() == totalSum) {
                System.out.printf("Best candidate is %s with total %d points.%n", user.getKey(), totalSum);
            }
        }

        System.out.println("Ranking:");
        users.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });
    }
}
