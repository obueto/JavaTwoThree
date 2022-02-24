package booksToRead;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A bookshelf")
public class BooksToReadSpec {

 //   @Test
 //public void shelfEmptyWhenNoBookAdded()throws Exception{
//        BookShelf shelf = new BookShelf();
//        List<String> books = shelf.books();
//        assertTrue(books.isEmpty(),()-> "BookShelf should be empty.");
//    }

    @Test
    @DisplayName(" is empty when no book is added to it")
     void shelfEmptyWhenNoBookAdded(TestInfo testInfo){
        System.out.println("working on test case" + testInfo.getDisplayName());
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(),()-> "BookShelf should be empty.");
    }
    @Test
    public void shelfToStringShouldPrintBookCountAndTiles()throws Exception{
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        shelf.add("The Phoenix Project");
        shelf.add("Java 8 in action");
        String shelfStr = shelf.toString();
        assertAll ( () -> assertTrue(shelfStr.contains("The Phoenix Project"), "ist book title missing"));
    }
}
