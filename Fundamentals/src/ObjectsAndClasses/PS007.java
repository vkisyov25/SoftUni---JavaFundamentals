package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS007 {
    static class Person{
        String name;
        String ID;
        int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        List<Person> personList =new ArrayList<>();

        while (!command.equals("End")){
            String[] arr = command.split(" ");
            Person p =new Person(arr[0],arr[1],Integer.parseInt(arr[2]));
            personList.add(p);

            command = scanner.nextLine();
        }

        //sorted
        personList.sort((f, s) ->f.getAge() - s.getAge());
        for (int i=0; i<personList.size(); i++){
            System.out.printf("%s with ID: %s is %d years old.%n",personList.get(i).getName(),personList.get(i).getID(),personList.get(i).getAge());
        }
    }
}
