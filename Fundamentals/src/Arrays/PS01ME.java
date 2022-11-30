package Arrays;

import java.util.Scanner;

public class PS01ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int num = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[num];
        for (int i=0; i<num; i++){
            String currentName = scanner.nextLine();

            for (int j=0; j<currentName.length(); j++){
                if (currentName.charAt(j) == 'A'|| currentName.charAt(j) == 'a'|| currentName.charAt(j) == 'E'|| currentName.charAt(j) == 'e' || currentName.charAt(j) == 'I'|| currentName.charAt(j) == 'i'||currentName.charAt(j) == 'O'|| currentName.charAt(j) == 'o'|| currentName.charAt(j) == 'U'|| currentName.charAt(j) == 'u'){
                    int ventsy1 = currentName.charAt(j);
                    sum += currentName.charAt(j)*5;
                }
                else {
                    int ventsy2 = currentName.charAt(j);
                    sum += currentName.charAt(j)/5;
                }

                //|| currentName.charAt(j) == 'Y'|| currentName.charAt(j) == 'y'
            }
            arr[i] = sum;
            sum = 0;

        }

        for (int v=0; v<arr.length; v++){
            for (int k=v+1; k<arr.length; k++){
                if(arr[k]<arr[v]){
                    int temp = arr[v];
                    arr[v] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        for(int m=0; m<arr.length; m++){
            System.out.println(arr[m]);
        }
    }
}
