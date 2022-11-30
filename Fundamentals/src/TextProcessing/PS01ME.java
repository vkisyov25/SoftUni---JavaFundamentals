package TextProcessing;

import java.util.Scanner;

public class PS01ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nLines = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<nLines; i++){
            StringBuilder sb = new StringBuilder(scanner.nextLine());

            int firstNameIndex = sb.indexOf("@");
            int secondNameIndex = sb.indexOf("|");
            String name = sb.substring(firstNameIndex+1,secondNameIndex);
            int age = Integer.parseInt(sb.substring(sb.indexOf("#")+1,sb.indexOf("*")));

            System.out.printf("%s is %d years old.%n",name,age);
        }
    }
}
