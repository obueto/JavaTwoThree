package chapterNine;

public class Aves extends Animal{
    public void breath(String beak){
        System.out.println("I am a peacock");
    }
    public void parentBreath(){
        super.breath();
    }
}
