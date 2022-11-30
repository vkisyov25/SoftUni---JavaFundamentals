package review;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students04 {
    static  class Student {
        String firstName;
        String secondName;
        double grade;

        public Student(String firstName, String secondName, double grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nLines = Integer.parseInt(scanner.nextLine());

        List<Student> studentsList = new ArrayList<>();

        for(int i=0; i<nLines; i++){
            String[] arr= scanner.nextLine().split(" ");

            String fName = arr[0];
            String sName = arr[1];
            double grade = Double.parseDouble(arr[2]);

            Student student = new Student(fName,sName,grade);
            studentsList.add(student);
        }

        studentsList.sort(Comparator.comparingDouble(Student::getGrade));

        for(int j=studentsList.size()-1; j>=0; j--){
            System.out.printf("%s %s: %.2f%n",studentsList.get(j).firstName,studentsList.get(j).secondName,studentsList.get(j).grade);
        }
    }
}
