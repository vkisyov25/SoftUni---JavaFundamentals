package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PS009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element -> Integer.parseInt(element)).toArray();

        String line = scanner.nextLine();

        String wordCommand = "";

        while (!line.equals("end")){

            String[] commandArr = line.split(" ");

            wordCommand = commandArr[0];

            if (wordCommand.equals("decrease")){
                for (int i=0; i< arr.length; i++){
                    arr[i] = arr[i] - 1;
                }
                line = scanner.nextLine();
                continue;
            }

            int index1 = Integer.parseInt(commandArr[1]);
            int index2 = Integer.parseInt(commandArr[2]);

            if(wordCommand.equals("swap")){
                int temp = arr[index1];
                arr[index1] = arr[index2];
                arr[index2] = temp;
            } else if (wordCommand.equals("multiply")){
                arr[index1] = arr[index1]*arr[index2];
            }

            line = scanner.nextLine();

        }
        for (int j=0; j< arr.length; j++){
            if (j != arr.length-1){
                System.out.print(arr[j]+", ");
            }
            else{
                System.out.print(arr[j]);
            }
        }

    }
}
