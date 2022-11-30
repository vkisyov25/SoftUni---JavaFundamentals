package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PS004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> attack = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i=0; i<n; i++){
            String input = scanner.nextLine();

            for (int j = 0; j < input.length(); j++) {
                char current = input.charAt(j);
                boolean small = current == 's' || current == 't' || current == 'a' || current == 'r';
                boolean big = current == 'S' || current == 'T' || current == 'A' || current == 'R';
                if (small || big) {
                    count++;
                }
            }
            for (int j = 0; j < input.length(); j++) {
                char current = input.charAt(j);
                char current1 = (char) (current - count);
                sb.append(current1);
            }

            String expression ="@(?<name>[A-Z][a-z]+)[^@:!\\->]*:(?<population>\\d+)!(?<command>[AD])!->(?<soldier>\\d+)";
            Pattern pattern = Pattern.compile(expression);
            Matcher matcher = pattern.matcher(sb);

            while (matcher.find()){
                String name = matcher.group("name");
                int population = Integer.parseInt(matcher.group("population"));
                String command = matcher.group("command");
                int soldier = Integer.parseInt(matcher.group("soldier"));

                if(command.equals("A")){
                    attack.add(name);
                } else if (command.equals("D")) {
                    destroyed.add(name);
                }
            }

            sb.setLength(0);
            count = 0;
        }
        Collections.sort(destroyed);
        Collections.sort(attack);

        if (attack.size() == 0) {
            System.out.println("Attacked planets: 0");
        } else {
            System.out.printf("Attacked planets: %d%n", attack.size());
            for (String planet : attack) {
                System.out.printf("-> %s%n", planet);
            }
        }
        if (destroyed.size() == 0) {
            System.out.println("Destroyed planets: 0");
        } else {
            System.out.printf("Destroyed planets: %d%n", destroyed.size());
            for (String planet : destroyed) {
                System.out.printf("-> %s%n", planet);
            }
        }
    }
}
