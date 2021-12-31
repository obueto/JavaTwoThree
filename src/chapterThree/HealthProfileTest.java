package chapterThree;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile healthProfile = new HealthProfile();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String name = input.nextLine();
        healthProfile.setFirstName(name);

        System.out.println("Enter your Surname");
        String lastName = input.nextLine();
        healthProfile.setLastName(lastName);

        System.out.println("Enter your gender");
        String gender = input.nextLine();
        healthProfile.setGender(gender);

        System.out.println("put in your day of birth");
        int day = input.nextInt();
        healthProfile.setDayOfBirth(day);

        System.out.println("type in your month of birth");
        int month = input.nextInt();
        healthProfile.setMonthOfBirth(month);

        System.out.println("What is your year of birth");
        int birthYear = input.nextInt();
        healthProfile.setYearOfBirth(birthYear);

        System.out.println( "What is your weight");
        double weight = input.nextDouble();
        healthProfile.setWeight(weight);

        System.out.println("What is your height");
        double height = input.nextDouble();
        healthProfile.setHeight(height);


        System.out.println("Your name is: " +healthProfile.getFirstName() + " " + healthProfile.getLastName());
        System.out.println("Your age in years is : " + healthProfile.calculateAgeInYears());
        System.out.println("Your maximum heart rate is : " + healthProfile.maximumHeartRate());
        System.out.printf("Your Maximum heart rate range between 50%% and 85%% is %.3f to %.3f%n ",
                healthProfile.calculateMaximumHeartRangeRateFor50() , healthProfile.calculateMaximumHeartRangeRateFor85());
        System.out.printf("Your Body Mass Index is %.2f :",  healthProfile.calculateBmi());


    }
}
