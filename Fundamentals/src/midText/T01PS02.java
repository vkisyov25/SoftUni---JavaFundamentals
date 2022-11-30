package midText;

import java.util.Scanner;

public class T01PS02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins =0;

        boolean isTrought = true;

        String[] arr1 = scanner.nextLine().split("\\|");

        for (int i=0; i< arr1.length; i++){

            String line = arr1[i];
            String[] arr = line.split(" ");
            String command = arr[0];
            int num = Integer.parseInt(arr[1]);

            if(command.equals("potion")){
                System.out.printf("You healed for %d hp.%n",num);
                if(num+health>=100){
                    System.out.println("Current health: 100 hp.");
                }else {
                    System.out.printf("Current health: %d hp.%n",num+health);
                }
            } else if (command.equals("chest")) {
                bitcoins +=num;
                System.out.printf("You found %d bitcoins.%n",num);
            }else {
                health -=num;
                if(health>0){
                    System.out.printf("You slayed %s.%n",command);
                }else {
                    isTrought =false;
                    System.out.printf("You died! Killed by %s.%n",command);
                    System.out.printf("Best room: %d%n",i+1);
                    break;
                }
            }

        }
        if (isTrought){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n",bitcoins);
            System.out.printf("Health: %d%n",health);

        }
    }
}
