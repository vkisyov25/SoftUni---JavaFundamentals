package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS004 {
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

        List<Article> articleList = new ArrayList<>();
        int num= Integer.parseInt(scanner.nextLine());

        for (int i=0; i<num; i++){
            String[] arr = scanner.nextLine().split(",");
            Article a = new Article(arr[0],arr[1],arr[2]);
            articleList.add(a);

        }

        for(int i=0; i< articleList.size(); i++){
            System.out.printf("%s -%s:%s%n",articleList.get(i).getTitle(),articleList.get(i).getContent(),articleList.get(i).getAuthor());
        }
    }

}

