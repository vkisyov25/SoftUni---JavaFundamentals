package ObjectsAndClasses;

import java.util.Scanner;

public class PS002 {
    static class Article{
        String title;
        String content;
        String author;

        public Article(String title,String content,String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setEdit(String content){
            this.content = content;
        }

        public void setTitle(String title) {
            this.title = title;
        }
        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(",");
        Article a = new Article(arr[0],arr[1],arr[2]);

        int commandNum = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<commandNum; i++){
            String[] command = scanner.nextLine().split(":");

            if(command[0].equals("Edit")){
                a.setEdit(command[1]);
            } else if (command[0].equals("ChangeAuthor")) {
                a.setAuthor(command[1]);
            } else if (command[0].equals("Rename")) {
                a.setTitle(command[1]);
            }
        }
        System.out.printf("%s -%s:%s",a.getTitle(),a.getContent(),a.getAuthor());
    }
}
