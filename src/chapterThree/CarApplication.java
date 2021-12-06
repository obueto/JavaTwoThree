package chapterThree;

public class CarApplication {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota","2007",3000000);
        Car bmw = new Car("BMW","2018",100000000);
        System.out.printf("The model of the car is %s year %s%n",toyota.getModel(),toyota.getYear());
        System.out.printf("The price of %s model is %.2f%n",toyota.getModel(),toyota.getPrice() - (toyota.getPrice() * 0.05));
        System.out.printf("The model of the car is %s year %s%n",bmw.getModel(),bmw.getYear());
        System.out.printf("The price of %s model is %.2f",bmw.getModel(),bmw.getPrice()-(bmw.getPrice() * 0.05));
    }
}
