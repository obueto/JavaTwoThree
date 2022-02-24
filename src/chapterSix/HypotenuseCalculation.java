package chapterSix;

public class HypotenuseCalculation {
    public static void main(String[] args) {

        System.out.println(hypotenuse(3.0,4.0));
        System.out.println(hypotenuse(8.0,15.0));
        System.out.println(hypotenuse(5.0,12.0));
    }

    public static double hypotenuse(double side1, double side2){
        double hypotenuse = Math.pow(side1,2) + Math.pow(side2,2);
        hypotenuse = Math.sqrt(hypotenuse);


        return hypotenuse;
    }
}

