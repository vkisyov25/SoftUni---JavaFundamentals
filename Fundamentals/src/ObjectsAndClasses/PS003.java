package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS003 {
    static class Person{
        String name;
        int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
        public String toString(){
            return String.format("%s - %d",getName(),getAge());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<n; i++){
            String[] arr = scanner.nextLine().split(" ");
            Person person = new Person(arr[0],Integer.parseInt(arr[1]));
            personList.add(person);
        }

        personList.stream()
                .filter(person -> person.getAge()>30)
                .sorted((p1,p2) ->p1.getName().compareTo(p2.getName()))
                .forEach(person -> System.out.println(person.toString()));
    }
}