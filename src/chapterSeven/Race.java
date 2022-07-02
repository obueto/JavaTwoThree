package chapterSeven;

import java.util.Random;

public class Race {
    private static final int race_end = 70;

    Random randomNumbers = new Random();

    int tortoise;
    int hare;
    int timer;

    public  void starRace(){
        tortoise = 1;
        hare = 1;
        timer = 0;
        System.out.println("On your mark Get set");
        System.out.println("Bang!!!");
        System.out.println("And they are off!!!");
        while (tortoise < race_end && hare < race_end){
            //moveHare();
            moveTortoise();
           // printCurrentPostions();

            for (int temp = 0; temp < 100000000;temp++);
            timer++;
        }
        if (tortoise>= hare)
            System.out.println("\nTortoise wins!!!Yaay!!!");
        else
            System.out.println("\n Hare wins Yuch!");
    }
    public  void moveTortoise(){
        int percent = 1 + randomNumbers.nextInt(10);
        //if (percent>= 1 && percent <= 5){
        }
    }


