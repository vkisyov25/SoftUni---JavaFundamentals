package Methods;

import java.util.Scanner;

public class PS004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        length(pass);
        fromWhatConsists(pass);
        isThereTwoDigits(pass);

        if(length(pass)== false){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(fromWhatConsists(pass)== false){
            System.out.println("Password must consist only of letters and digits");
        }
        if(isThereTwoDigits(pass)== false){
            System.out.println("Password must have at least 2 digits");
        }

        if(length(pass)==true && fromWhatConsists(pass)==true && isThereTwoDigits(pass)== true){
            System.out.println("Password is valid");
        }

    }

    public static boolean length (String pass){
        if(pass.length() >=6 && pass.length()<=10){
            return true;
        }else {
            return false;
        }
    }

    public static boolean fromWhatConsists(String pass){
        boolean isConsists = false;
        for (int i=0; i<pass.length(); i++){
            int num = pass.charAt(i);
            if((num>=48 && num<=57) || (num>=65 && num<=90) || (num>=97 && num<=122)){
                 isConsists =true;
            }
            else {
                isConsists = false;
                break;
            }
        }

        if(isConsists==true){
            return true;
        }
        else{
            return false;
        }

    }

    public static boolean isThereTwoDigits(String pass){
        int count = 0;
        for (int i=0; i<pass.length(); i++){
            int num = pass.charAt(i);
            if(num>=48 && num<=57){
                count++;
            }
        }

        if(count>=2){
            return true;
        }
        else {
            return false;
        }

    }
}
