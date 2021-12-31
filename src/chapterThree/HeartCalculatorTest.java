package chapterThree;

import java.util.Scanner;


public class HeartCalculatorTest {
    public static void main(String[] args) {


        HeartCalculator heartCalculator = new HeartCalculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        heartCalculator.setFirstName(firstName);

        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        heartCalculator.setLastName(lastName);

        System.out.println("Enter your day of birth");
        int dayOfBirth = input.nextInt();
        heartCalculator.setDayOfBirth(dayOfBirth);


        System.out.println("Enter your month of birth");
        int monthOfBirth = input.nextInt();
        heartCalculator.setMonthOfBirth(monthOfBirth);

        System.out.println("Enter your year of birth");
        int yearOfBirth = input.nextInt();
        heartCalculator.setYearOfBirth(yearOfBirth);


        System.out.println("Your name is: "+ heartCalculator.getFirstName() + " " +  heartCalculator.getLastName());
        System.out.println("Your date of birth is: " +heartCalculator.getDayOfBirth() +" "+ heartCalculator.getMonthOfBirth()
             + " "   + heartCalculator.getYearOfBirth()  );
        System.out.println("Your age in years is :"+ heartCalculator.calculateAgeInYears());
        System.out.println("Your Maximum Heart rate is :" + heartCalculator.calculateMaxHeartRate());
        System.out.printf("Your target heart rate range @ 50%% is %.2f  and @ 85%% is %.2f:",  heartCalculator.calculateTargetHeartRange50()
                , heartCalculator.calculateTargetHeartRange85());
    }
}
