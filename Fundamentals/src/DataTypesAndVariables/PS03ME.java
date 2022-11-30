package DataTypesAndVariables;

import java.util.Scanner;

public class PS03ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());

        int countOpen =0;
        int countClose =0;

        for(int i=0; i<n; i++){
            String text = scanner.nextLine();

            if (text.equals("(")){
                countOpen++;
            }

            if (countOpen==2){
                System.out.println("UNBALANCED");
                text = "";
                countOpen = 0;
            }

            if(countOpen == 1 && text.equals(")")){
                System.out.println("BALANCED");
                text = "";
                countOpen=0;
            }

            if (text.equals(")")){
                countOpen++;
            }

            if (countClose==2){
                System.out.println("UNBALANCED");
                text = "";
                countClose=0;
            }

            if(countClose == 1 && text.equals("(")){
                System.out.println("BALANCED");
                text = "";
                countClose = 0;
            }
        }
    }
}
