package DataTypesAndVariables;

import java.util.Scanner;

public class PS01ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        byte count=0;

        while (!command.equals("END")){

            if(Character.isDigit(command.charAt(0)) ||command.contains("-")){
                if(command.contains(".")){
                    System.out.printf("%s is floating point type%n",command);
                }
                else{
                    System.out.printf("%s is integer type%n",command);
                }
            }else if(command.equals("true") || command.equals("false")){
                System.out.printf("%s is boolean type%n",command);
            }else {
                for (int i=0; i<command.length(); i++){
                    count++;
                }
                if (count>1){
                    System.out.printf("%s is string type%n",command);
                }else{
                    System.out.printf("%s is character type%n",command);
                }

            }

            command = scanner.nextLine();
        }
    }
}
