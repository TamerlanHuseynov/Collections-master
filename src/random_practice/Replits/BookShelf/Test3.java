package random_practice.Replits.BookShelf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        System.out.println(capitalize(""));

        List<Integer> pew = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println("not cleared: " + pew);
        pew.clear();
        System.out.println("cleared: "+pew);
        System.out.println("is list empty? " + pew.isEmpty());

    }
    String author;
    String title;
    private int unknownAuthors;
    private int pages;
    private int id;




    public Test3(int id, String author, String title, int pages ) {
        // TODO
//        this.id = setId(id);
//        this.author = setAuthor(author);
//        this.title = setTitle(title);
//        this.pages = setPages(pages);

    }




    public static Boolean isTitleWord(String word) {
        Boolean result = true;
        switch(word){
            case "a":
            case "an":
            case "the":
            case "and":
            case "but":
            case "for":
            case "nor":
            case "or":
            case "on":
            case "to":
            case "than":
            case "via": result = false;
        }
        return result;
    }



    public void setTitle(String title) {
        if (title==null || title.isEmpty()){this.title = "";}
        else if(!title.contains(" ")){this.title = capitalize(title); }
        else if(title.contains(" ")){
            String[] titles = title.split(" ");
            titles[0] = capitalize(titles[0]);
            for(int i = 1; i <titles.length; i++){
                if(isTitleWord(titles[i])){
                    titles[i] = capitalize(titles[i]);
                }else{
                    titles[i] = titles[i].toLowerCase();
                }
            }
            this.title = String.join(" ", titles);
        }
    }






    public void setAuthor(String author) {
        // TODO
        if(author==null || author.isEmpty() ){
            this.author = "Unknown";
            unknownAuthors++;
        }else{
            String[] names = author.split(" ");
            for(int i = 0; i < names.length; i++){
                names[i] = capitalize(names[i]);
            }
            this.author = String.join(" ", names);
        }

    }

    public static String capitalize(String word) {
        if (word==null || word.isEmpty()){return "";}
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

}
