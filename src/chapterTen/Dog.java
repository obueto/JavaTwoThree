package chapterTen;

public class Dog extends Human implements Moveable,Flyable{
    @Override
    public void move() {
        System.out.println("dogs too can move and walk");
    }
}
