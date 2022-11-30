package Methods;

import java.util.Scanner;

public class PS009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")){
            int length = command.length();
            if(command.charAt(0) == command.charAt(length-1)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

            command = scanner.nextLine();
        }
    }
}
