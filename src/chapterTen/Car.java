package chapterTen;

public class Car {
    private int cylinder;
    private int wheels;
    private boolean engine;
    private String name;


    public Car(int cylinder, String name){
        this.cylinder =cylinder;
        this.wheels = 4;
        this.engine = true;
        this.name = name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }
    public void startEngine(){
        System.out.println ("Engine to start");
    }
    public void accelerate(){
        System.out.println("accelerate with caution");
    }
    public void brake(){
        System.out.println("break will slow the car down");
    }
}
class HighLander extends Car{


    public HighLander(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void startEngine() {
        System.out.println("Highlander has its own engine");
    }

    @Override
    public void brake() {
        super.brake();
    }
}
class  Venza extends Car{


    public Venza(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public void brake() {
        System.out.println("break for venza");;
    }
}
class Range extends  Car{


    public Range(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public void brake() {
        System.out.println("break for range");;
    }
}
class Main{
    public static void main(String[] args) {
        Car car = new Car(20,"Base car");
        car.accelerate();
        car.brake();
        car.startEngine();
    }
}