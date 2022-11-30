package Arrays;

import java.util.Scanner;

public class PS001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] trains = new int[wagons];

        int peopleSum=0;

        for(int i=0; i<wagons; i++){
            trains[i] = Integer.parseInt(scanner.nextLine());
            peopleSum += trains[i];
        }

        for (int j=0; j<trains.length; j++){
            System.out.print(trains[j] +" ");
        }
        System.out.println();
        System.out.println(peopleSum);
    }
}
