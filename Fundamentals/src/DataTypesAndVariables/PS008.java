package DataTypesAndVariables;

import java.util.Scanner;

public class PS008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String name = "";

        for (byte i=0; i<n; i++){

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI* radius*radius*height;

            if(volume>maxVolume){
                maxVolume = volume;
                name = model;
            }
        }
        System.out.println(name);
    }
}
