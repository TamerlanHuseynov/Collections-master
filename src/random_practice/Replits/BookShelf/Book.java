package random_practice.Replits.BookShelf;

public class Book {
    private String author;
    private String title;
    private int id;
    private int pages;
    private static int unknownAuthors;

    public static String capitalize(String word) {
        if (word==null || word.isEmpty()){return "";}
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
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

    public Book() { }

    public Book(int id, String author, String title, int pages ) {
        // TODO
        setId(id);
        setAuthor(author);
        setTitle(title);
        setPages(pages);

    }

    public void setAuthor(String author) {

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

    public String toString() {
        return "Book[author=" + author + ", " +
                "title="+ title + ", " +
                "id=" + id + ", " +
                "pages=" + pages + "]";
// [Book[author=J K Rowling, title=Harry Potter, id=1, pages=556], Book[author=J K Rowling, title=Fantastic Beasts, id=5, pages=540]]
    }

    public static int getUnknownAuthors(){
        return unknownAuthors;
    }

    public int getPages() {
        return this.pages;
    }


    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

