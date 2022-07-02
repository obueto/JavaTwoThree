package chapterSeven;

import java.util.Scanner;

public class AirLineReservation {

    private static boolean[] first_array = new boolean[5];
    private static boolean[] economy_array = new boolean[6];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ticket_reservation();


    }

    public static void ticket_reservation() {
        int count_first = 1;
        int count_economy = 5;
        System.out.println("""
                Pick a number to make your reservations
                
                Kindly type 1 for First class ticket!!
                
                Please type 2 for Economy ticket!!
                
                """);
        int userInput = scanner.nextInt();
                switch (userInput) {
                    case 1 -> {
                        for (int i = 0; i < first_array.length; i++) {
                            first_array[i] = true;
                            System.out.println("This is a First Class booking");
                            System.out.println("Your seat number is :" + count_first);
                            count_first++;


                            if (count_first == 6) {
                                System.out.println("Already full please check reservation for economy class");
                            }
                            //break;
                        }


                    }

                    case 2 -> {
                        for (int i = 0; i < economy_array.length; i++) {
                            economy_array[i] = true;
                            System.out.println("This is an Economy Class booking");
                            System.out.println("Your seat number is :" + count_economy);
                            count_economy++;

                            if (count_economy == 11) {
                                System.out.println("Already full please check reservation for first class");

                            }
                            //break;

                        }


                    }


            }




    }


    }
