package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PS0010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lessonsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("course start")) {
            String[] arr = line.split(":");
            String command = arr[0];

            if (command.equals("Add")) {
                String lessonTitle = arr[1];
                boolean isFound =true;
                for (int i = 0; i < lessonsList.size(); i++) {
                    if (lessonsList.get(i).equals(lessonTitle)) {
                        isFound=false;
                    }
                }

                if(isFound){
                    lessonsList.add(lessonTitle);
                }

            } else if (command.equals("Insert")) {
                String lessonTitle = arr[1];
                int index = Integer.parseInt(arr[2]);

                boolean isFound =true;
                for (int i = 0; i < lessonsList.size(); i++) {
                    if (lessonsList.get(i).equals(lessonTitle)) {
                        isFound=false;
                    }
                }

                if(isFound){
                    lessonsList.add(index,lessonTitle);
                }
            } else if (command.equals("Remove")) {
                String lessonTitle = arr[1];
                for (int i = 0; i < lessonsList.size(); i++) {
                    if (lessonsList.get(i).equals(lessonTitle)) {
                        lessonsList.remove(lessonTitle);
                        i--;
                    }

                }

            } else if (command.equals("Swap")) {
                String lessonTitle1 = arr[1];
                String lessonTitle2 = arr[2];
                int index1 = 0;
                int index2 = 0;
                for (int i = 0; i < lessonsList.size(); i++) {
                    if (lessonsList.get(i).equals(lessonTitle1)) {
                        index1 = i;
                    }
                    if (lessonsList.get(i).equals(lessonTitle2)) {
                        index2 = i;
                    }
                }
                boolean isFoundTitle1 =false;
                boolean isFoundTitle2 =false;
                int indexxx1=0;
                int indexxx2=0;
                for (int i = 0; i < lessonsList.size(); i++) {
                    if (lessonsList.get(i).equals(lessonTitle1 + "-Exercise")) {
                        isFoundTitle1 = true;
                        indexxx1=i;
                    }
                    if (lessonsList.get(i).equals(lessonTitle2 + "-Exercise")) {
                        isFoundTitle2 = true;
                        indexxx2=i;
                    }
                }
                if(isFoundTitle1){
                    lessonsList.set(index2, lessonTitle1);
                    lessonsList.set(index2+1, lessonTitle1 + "-Exercise");
                    if(index1+1<indexxx1+1){
                        lessonsList.remove(indexxx1+1);
                    }else {
                        lessonsList.remove(indexxx1-1);
                    }
                    //lessonsList.remove(indexxx1+1);
                    lessonsList.set(index1, lessonTitle2);
                }else if(isFoundTitle2){
                    lessonsList.set(index2, lessonTitle1);
                    lessonsList.set(index1, lessonTitle2);
                    lessonsList.add(index1+1, lessonTitle2 + "-Exercise");
                    if(index2+1<indexxx2+1){
                        lessonsList.remove(indexxx2+1);
                    }else {
                        lessonsList.remove(indexxx2-1);
                    }
                }else {
                    lessonsList.set(index2, lessonTitle1);
                    lessonsList.set(index1, lessonTitle2);
                }
                //lessonsList.set(index2, lessonTitle1);
                //lessonsList.set(index1, lessonTitle2);

            } else if (command.equals("Exercise")) {
                String lessonTitle = arr[1];
                boolean isFoundLesson = false;
                int lessonIndex = 0;
                boolean isFoundExercise = false;
                for (int i = 0; i < lessonsList.size(); i++) {
                    if (lessonsList.get(i).equals(lessonTitle)) {
                        isFoundLesson = true;
                        lessonIndex = i;
                    }
                    if (lessonsList.get(i).equals(lessonTitle + "-Exercise")) {
                        isFoundExercise = true;
                    }

                }

                if(isFoundExercise==false && isFoundLesson == false){
                    lessonsList.add(lessonTitle);
                    lessonsList.add(lessonTitle + "-Exercise");
                }
                if (isFoundLesson == true && isFoundExercise == false) {
                    lessonsList.add(lessonIndex + 1, lessonTitle + "-Exercise");
                }



            }
            line = scanner.nextLine();
        }

        for(int i=0; i<lessonsList.size(); i++){
            int index = i+1;
            System.out.printf("%d.%s%n",index,lessonsList.get(i));
        }
    }
}
