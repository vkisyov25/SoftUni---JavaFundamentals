package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS005 {
    static class Student {
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] arr = scanner.nextLine().split(" ");

            Student s = new Student(arr[0], arr[1], Double.parseDouble(arr[2]));
            studentsList.add(s);
        }
        List<Double> sortedList = new ArrayList<>();

        sorted(studentsList, sortedList);


        printed(studentsList, sortedList);
    }

    private static void printed(List<Student> studentsList, List<Double> sortedList) {
        for (int i = 0; i < studentsList.size(); i++) {
            for (int j = 0; j < studentsList.size(); j++) {
                if (sortedList.get(i) == studentsList.get(j).getGrade())
                    System.out.printf("%s %s: %.2f%n", studentsList.get(j).getFirstName(), studentsList.get(j).getLastName(), studentsList.get(j).getGrade());
            }
        }
    }

    private static void sorted(List<Student> studentsList, List<Double> sortedList) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i< studentsList.size(); i++){
            //System.out.printf("%s %s:%.2f%n",studentsList.get(i).getFirstName(),studentsList.get(i).getLastName(),studentsList.get(i).getGrade());
            list.add(studentsList.get(i).getGrade());
        }

        double maxNum = Integer.MIN_VALUE;

        while(list.size() != 0){

            for (int i=0; i<list.size(); i++){
                if(list.get(i)>maxNum){
                    maxNum = list.get(i);
                }
            }
            sortedList.add(maxNum);
            list.remove((Double) maxNum);
            maxNum = Integer.MIN_VALUE;
            //i--;

        }
    }
}
