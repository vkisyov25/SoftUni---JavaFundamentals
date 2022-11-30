package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PS05 {
    static class Student {
        String firstName;
        String lastName;
        int age;
        String hometown;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();
        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] arr =command.split(" ");

            String name = arr[0];
            String surname = arr[1];
            int yearsOld = Integer.parseInt(arr[2]);
            String town = arr[3];


            Student s = new Student();

            s.firstName = name;
            s.lastName = surname;
            s.age = yearsOld;
            s.hometown = town;

            studentsList.add(s);




            command = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (int i=0; i<studentsList.size(); i++){
            if(studentsList.get(i).hometown.equals(city)){
                System.out.printf("%s %s is %d years old%n",studentsList.get(i).firstName,studentsList.get(i).lastName,studentsList.get(i).age);
            }
        }
    }

}
