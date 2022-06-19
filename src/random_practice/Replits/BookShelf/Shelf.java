package random_practice.Replits.BookShelf;
import java.util.*;

public class Shelf {

    private Shelf() {}

    private static List<Book> theBooks = new ArrayList<>();

    public static List<Book> getTheBooks() {
        return theBooks;
    }

    public static boolean isShelfEmpty(){
        return theBooks.size() == 0;
    }

    public static boolean isIDUnique(int id){
        for(int i=0; i<theBooks.size(); i++){
            if(theBooks.get(i).getId() == id){return false;}
        }
        return true;
    }

    public static boolean addBook(int id, String author, String title, int pages ){
        if (isIDUnique(id) && !title.isEmpty() && pages > 0){
            theBooks.add(new Book(id, author, title, pages) );
            return true;
        }
        return false;
    }

    public static boolean addBook(Book book){
        if (isIDUnique(book.getId()) && !book.getTitle().isEmpty() && book.getPages() > 0){
            theBooks.add(book);
            return true;
        }
        return false;
    }

    public static String getTitleByID(int id) {
        for(int i = 0; i < theBooks.size(); i++){
            if(theBooks.get(i).getId() == id){
                return theBooks.get(i).getTitle();
            }
        }
        return "book not found";
    }

    public static Book findBookByPartialTitle(String title) {
        title = title.toLowerCase();
        for(int i = 0; i < theBooks.size(); i++){
            if(theBooks.get(i).getTitle().toLowerCase().contains(title)){
                return theBooks.get(i);
            }
        }
        return null;
    }

    public static List<Book> getAllBooksForAuthor(String author) {
        List<Book> pew = new ArrayList<>();
        for(int i = 0; i < theBooks.size(); i++){
            if(theBooks.get(i).getAuthor().equalsIgnoreCase(author)){
                pew.add(theBooks.get(i));
            }
        }
        return pew;
    }

    public static void removeBook(int id) {
        for(int i = 0; i < theBooks.size(); i++){
            if(theBooks.get(i).getId() == id){
                theBooks.remove(i);
                break;
            }
        }
    }

    public static void removeBook(String author) {
        for(int i = 0; i < theBooks.size(); i++){
            if(theBooks.get(i).getAuthor().equals(author)){
                theBooks.remove(i);
            }
        }
    }

    public static void clearBookShelf() {
        theBooks.clear();
    }

}

