package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS04ME {
    static class Creator{
        String name;
        String teamName;

        public Creator(String name, String teamName) {
            this.name = name;
            this.teamName = teamName;
        }

        public String getName() {
            return name;
        }

        public String getTeamName() {
            return teamName;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<Creator> creatorList =new ArrayList<>();

        String[] arr=null;

        for(int i=0; i<num; i++){
            arr = scanner.nextLine().split("-");
            Creator creator = new Creator(arr[0],arr[1]);
            creatorList.add(creator);
        }

        for (int j=0; j<creatorList.size(); j++) {
            if (arr[1].equals(creatorList.get(j).getTeamName())) {
                System.out.printf("Team %s was already created!%n", arr[1]);
            } else if (arr[0].equals(creatorList.get(j).getName())) {
                System.out.printf("%s cannot create another team!%n", arr[0]);
            } else {
                System.out.printf("Team %s has been created by %s!%n",creatorList.get(j).getTeamName(),creatorList.get(j).getName());
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end of assignment")){
            String[] arr1 = command.split("->");

            //for (int i=0; i<creatorList.size(); i++){
            //    if(arr[1].equals(creatorList.get(i).getTeamName())){
            //    }
            //}

            command = scanner.nextLine();
        }
    }
}
