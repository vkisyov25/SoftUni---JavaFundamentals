package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS05Edited {
    static class Student1 {
        String firstName;
        String lastName;
        int age;
        String hometown;

        public Student1(String firstName,String lastName,int age,String hometown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }
        public String getHometown() {
            return hometown;
        }

        //public void se
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student1> studentsList = new ArrayList<>();
        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] arr =command.split(" ");

            Student1 s = new Student1(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3]);
            studentsList.add(s);




            command = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (int i=0; i<studentsList.size(); i++){
            if(studentsList.get(i).getHometown().equals(city)){
                System.out.printf("%s %s is %d years old%n",studentsList.get(i).firstName,studentsList.get(i).lastName,studentsList.get(i).age);
            }
        }
    }
}
