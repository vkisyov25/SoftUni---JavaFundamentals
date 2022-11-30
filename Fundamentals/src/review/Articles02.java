package review;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles02 {
    static class Article{
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void Edit(String content) {
            this.content = content;
        }

        public void ChangeAuthor(String author) {
            this.author = author;
        }

        public void Rename(String title){
            this.title = title;
        }

        public void ToString(){
            System.out.printf("%s - %s: %s",title,content,author);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list  = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Article article = new Article(list.get(0), list.get(1), list.get(2));

        int nLines = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<nLines; i++){
            String text = scanner.nextLine();

            String[] arr = text.split(": ");

            String command = arr[0];

            if(command.equals("Edit")){
                article.Edit(arr[1]);
            } else if (command.equals("ChangeAuthor")) {
                article.ChangeAuthor(arr[1]);
            } else if (command.equals("Rename")) {
                article.Rename(arr[1]);
            }

        }
        article.ToString();
    }
}
