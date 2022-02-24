package chapterNine.fruit;

public class Fruit {
    private String shape;
    private String color;
    private int calories;

    public Fruit(String shape,String color,int calories){
        this.shape = shape;
        this.color = color;
        this.calories = calories;
    }

public void decode(){
    System.out.println("method can decode");
}
    @Override
    public String toString() {

        return String.format("%s,%s,%d",shape,color,calories);
    }
}
