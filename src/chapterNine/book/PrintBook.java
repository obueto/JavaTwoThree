package chapterNine.book;

import chapterNine.book.Book;

public class PrintBook extends Book {
    String publisher;
    String isbnNumber;
    public PrintBook(String title, int year, String authorName,String publisher,String isbnNumber) {
        super(title, year, authorName);
        this.publisher = publisher;
        this.isbnNumber = isbnNumber;
    }

    public String toString(){
        return String.format("%s Publisher: %s \n ISBM : %s \n",super.toString(),publisher,isbnNumber);
    }

}
