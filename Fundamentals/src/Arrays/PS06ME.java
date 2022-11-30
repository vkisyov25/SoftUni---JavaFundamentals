package Arrays;

import java.util.Scanner;

public class PS06ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[fieldSize];
        String[] indexes = scanner.nextLine().split(" ");

        int sum;

        for (int i=0; i<indexes.length; i++){
            int num = Integer.parseInt(indexes[i]);
            for(int d=0; d<arr.length; d++){
                if (num == d){
                    arr[d]=1;
                }
            }

        }

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] arrCommand = command.split(" ");
            int start = Integer.parseInt(arrCommand[0]);
            int end = Integer.parseInt(arrCommand[2]);
            if(start<0 || start>=arr.length || arr[start]!=1 ){
                command = scanner.nextLine();
                continue;
            }
            else {
                if(arrCommand[1].equals("right")){
                    sum = start + end;
                    for (int v=0; v<arr.length; v++){
                        arr[start] = 0;
                        //int sum = start + end;
                        if(sum== arr.length){
                            break;
                        }
                        if(arr[sum] == 0){
                            arr[sum] = 1;
                        }
                        else{
                            sum += 1;
                        }


                    }
                }else{
                    sum = start - end;
                    for (int v=0; v<arr.length; v++){
                        arr[start] = 0;
                        if(sum== arr.length){
                            break;
                        }
                        if(arr[sum] == 0){
                            arr[sum] = 1;
                            break;
                        }
                        else{
                            sum += 1;
                        }

                    }
                }

            }



            command = scanner.nextLine();
        }
        for(int p=0; p<arr.length;p++){
            System.out.print(arr[p] +" ");
        }
    }
}
