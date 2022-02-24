package chapterNine.book;

public class Book {
    private String title;
    private int year;
    private String authorName;

    public Book(String title, int year, String authorName){
        this.title = title;
        this.year = year;
        this.authorName = authorName;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    @Override
    public String toString() {
        return String.format("%s %d %s","Title",title,"Year",year,"Author",authorName);
    }

}
