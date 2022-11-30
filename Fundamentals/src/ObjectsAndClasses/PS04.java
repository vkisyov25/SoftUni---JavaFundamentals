package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS04 {
    static class Song{
        String typeList;
        String name;
        String time;

        public Song(String typeList,String name,String time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
        public String getTypeList(){
            return typeList;
        }
        public String getName(){
            return name;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int songsNum = Integer.parseInt(scanner.nextLine());

        List<Song> songsList = new ArrayList<>();

        for(int i=0; i<songsNum; i++){
            String[] data = scanner.nextLine().split("_");

            Song s = new Song(data[0],data[1],data[2]);
            songsList.add(s);
        }

        String command = scanner.nextLine();

        if(command.equals("all")){
            for(int i=0; i<songsList.size(); i++){
                System.out.println(songsList.get(i).getName());
            }
        }
        else {
            for(int i=0; i<songsList.size(); i++){
                if(command.equals(songsList.get(i).getTypeList())){
                    System.out.println(songsList.get(i).getName());
                }
            }
        }
    }
}
