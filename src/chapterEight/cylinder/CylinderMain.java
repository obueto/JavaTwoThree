package chapterEight.cylinder;

public class CylinderMain {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(20,34.2);
        System.out.println("The Volume is : "+ cylinder.volume(cylinder.getRadius(), cylinder.getHeight()));
    }
}
