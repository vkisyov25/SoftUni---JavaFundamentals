package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS06 {
    static class Student2{
        String firstName;
        String lastName;
        int age;
        String hometown;

        //constructor
        public Student2(String firstName,String lastName,int age,String hometown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        //getters
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public String getHometown(){
            return hometown;
        }
        //setters

        public void setAge(int age) {
            this.age = age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student2> studentsList = new ArrayList<>();
        String command = scanner.nextLine();
        while(!command.equals("end")){
            String[] arr =command.split(" ");

            Student2 s = new Student2(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3]);
            //studentsList.add(s);

            int existingIndex = findStudentIndex(s.getFirstName(), s.getLastName(), studentsList);

            if(existingIndex != -1){

                studentsList.get(existingIndex).setHometown(s.getHometown());
                studentsList.get(existingIndex).setAge(s.age);
            }else {
                studentsList.add(s);
            }


            command = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (int i=0; i<studentsList.size(); i++){
            if(studentsList.get(i).getHometown().equals(city)){
                System.out.printf("%s %s is %d years old%n",studentsList.get(i).firstName,studentsList.get(i).lastName,studentsList.get(i).age);
            }
        }
    }

    public static int findStudentIndex(String firstName, String lastName, List<Student2> studentsList ){
        for(int i=0; i<studentsList.size(); i++){
            if(studentsList.get(i).getFirstName().equals(firstName) && studentsList.get(i).getLastName().equals(lastName)){
                return i;
            }
        }
        return -1;
    }
}
