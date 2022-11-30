package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectsAndClasses1 {
    static class Song{
        String type;
        String name;
        String time;

        public Song(String type, String name, String time) {
            this.type = type;
            this.name = name;
            this.time = time;
        }

        public String getType() {
            return type;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int songsNumber =Integer.parseInt(scanner.nextLine());

        List<Song> songsList = new ArrayList<>();

        for (int i=0; i<songsNumber; i++){
            String command = scanner.nextLine();
            String[] arr = command.split("_");

            String type = arr[0];
            String name = arr[1];
            String time = arr[2];

            Song s = new Song(type,name,time);
            songsList.add(s);
        }

        String musicType = scanner.nextLine();
        if(musicType.equals("all")){
            for (int j=0; j<songsList.size(); j++){
                System.out.println(songsList.get(j).name);
            }
        }else {
            for (int j=0; j<songsList.size(); j++){
                if(songsList.get(j).getType().equals(musicType)){
                    System.out.println(songsList.get(j).name);
                }
            }
        }
    }
}
