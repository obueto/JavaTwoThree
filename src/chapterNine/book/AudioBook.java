package chapterNine.book;

public class AudioBook extends Book {
    int bookSize;
    int playLength;
    String artistName;
    public AudioBook(String title, int year, String authorName,int bookSize,int playLength,String artistName) {
        super(title, year, authorName);
        this.bookSize = bookSize;
        this.playLength = playLength;
        this.artistName = artistName;
    }
    @Override
    public String toString(){
        return String.format("%s The book size is :%d \n The play length is : %d \n The artist name: %s",super.toString(),bookSize,playLength,artistName);
    }
}
