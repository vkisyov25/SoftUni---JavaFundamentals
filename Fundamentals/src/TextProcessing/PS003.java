package TextProcessing;

import java.util.Scanner;

public class PS003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();

        String file = path.substring(path.lastIndexOf("\\")+1);

        String name = file.substring(0,file.indexOf("."));
        String expresion = file.substring(file.indexOf(".")+1);

        System.out.printf("File name: %s%n",name);
        System.out.printf("File extension: %s%n",expresion);
    }
}
