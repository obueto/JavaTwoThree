package chapterEight.cylinder;

public class Cylinder {
    private int radius = 1;
    private double height = 1;

    public  Cylinder(int radius,double height){
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0)
            throw  new IllegalArgumentException("radius most be positive numbers");
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (radius <= 0.0)
            throw  new IllegalArgumentException("height must be a positive number");
        this.height = height;
    }

    public  double volume(int radius,double height){
        return  Math.PI * (radius * radius) * height;
    }


}
