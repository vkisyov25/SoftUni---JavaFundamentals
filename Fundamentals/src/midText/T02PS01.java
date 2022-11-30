package midText;

import java.util.Scanner;

public class T02PS01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double foodKg = Double.parseDouble(scanner.nextLine())*1000;
         double hayKg = Double.parseDouble(scanner.nextLine())*1000;
         double cover = Double.parseDouble(scanner.nextLine())*1000;
         double weight = Double.parseDouble(scanner.nextLine())*1000;

         //double food = 0;
         //double hay =0;
         for(int i=1; i<=30; i++){
             //food +=300;
             foodKg -=300;
             if(i%2==0){
                hayKg -= 0.05 * foodKg;
             }
             if(i%3==0){
                cover -= weight/3;
             }

         }

         if(foodKg>0 && hayKg>0 && cover>0){
             System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodKg/1000,hayKg/1000,cover/1000);
         }else {
             System.out.println("Merry must go to the pet store!");
         }
    }
}
