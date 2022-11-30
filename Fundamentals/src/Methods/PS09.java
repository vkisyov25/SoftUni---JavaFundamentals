package Methods;

import java.util.Scanner;

public class PS09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String type = scanner.nextLine();
        if(type.equals("int")){
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(num1,num2));
        } else if (type.equals("char")) {
            String one1 = scanner.nextLine();
            String two2 = scanner.nextLine();

            char one = one1.charAt(0);
            char two = two2.charAt(0);
            System.out.println(getMax(one,two));
        } else if (type.equals("string")) {
            String text1 = scanner.nextLine();
            String text2 = scanner.nextLine();
            System.out.println(getMax(text1,text2));
        }
    }

    public static int getMax(int num1, int num2){
        if(num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    }

    public static char getMax(char one, char two){
        if(one>two){
            return one;
        }
        else {
            return two;
        }
    }

    public static String getMax(String text1, String text2){
        if(text1.compareTo(text2) >= 0){
            return text1;
        }else {
            return text2;
        }
    }
}
