package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class PS02 {
    public static void main(String[] args) {
        double pounds = new Scanner(System.in).nextDouble();
        double toDolars = pounds * 1.36;

        System.out.printf("%.3f",toDolars);

        //BigDecimal
        //Scanner scanner = new Scanner(System.in);
        //BigDecimal number = new BigDecimal(scanner.nextInt());
        //number = number.multiply(BigDecimal.valueOf(1.36));
        //System.out.println(number);


    }
}
