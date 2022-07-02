package sideHustle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//set does not  guarantee order and elements in it do not duplicate
public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("orange"));
        balls.add(new Ball("pink"));
        balls.forEach(System.out::println);


    }
    static class Ball
             {String color;
             public Ball(String color){
              this.color = color;
             }
             }
}


