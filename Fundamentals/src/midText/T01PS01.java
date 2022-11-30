package midText;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class T01PS01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsNum = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double[] arr1 = new double[studentsNum];
        double[] arr2 = new double[studentsNum];

        double totalBonus=0;
        int attendancesCount=0;
        for(int i=0; i<studentsNum; i++) {
            attendancesCount = Integer.parseInt(scanner.nextLine());
            arr1[i]=attendancesCount;

            totalBonus = (attendancesCount / (double)lectures) * (5 + additionalBonus);
            arr2[i] = totalBonus;
        }
        double maxNum = Double.MIN_VALUE;
        int count =0;
        for (int j=0; j<arr2.length; j++){
            if(arr2[j]>maxNum){
                maxNum=arr2[j];
                count =j;
            }
        }
        DecimalFormat df = new DecimalFormat("#.#######");
        System.out.println("Max Bonus: "+df.format(Math.round(maxNum))+".");
        System.out.println("The student has attended "+df.format(arr1[count])+" lectures.");
    }
}
