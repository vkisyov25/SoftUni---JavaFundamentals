package Methods;

import java.util.Scanner;

public class PS06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println(rectangleArea(width,length));
    }

    public static int rectangleArea(int w,int l){
        int area = w*l;

        return  area;
    }
}
