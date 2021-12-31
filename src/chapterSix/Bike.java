package chapterSix;

import java.util.Scanner;

public class Bike {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        AutomaticBike suzuki = new AutomaticBike("Suzuki");
        String onPrompt = """
                1. Power On
                2. Power Off
                """;
        System.out.println(onPrompt);
        int onPromptInt = userInput.nextInt();
        suzuki.turnOn();
        do {
            switch (onPromptInt){
                case 1:
                        String nextPrompt = """
                                1. Set Gear
                                2. Accelerate
                                3. Decelerate
                                4. Exit
                                """;
                        System.out.println(nextPrompt);
                        int promptInt = userInput.nextInt();

                    switch (promptInt){
                        case 1:
                            suzuki.setGear();
                            System.out.println("Gear is " + suzuki.getGear());
                            break;
                        case 2:
                            for (int i = 0; i < 20; i++) {
                                suzuki.accelerate(2);
                            }
                            System.out.println("The speed is " + suzuki.getSpeed());
                            suzuki.setGear();
                            System.out.println("The gear is " + suzuki.getGear());
                            break;
                        case 3:
                            //todo;
                            break;
                        case 4:
                            System.exit(0);

                    }
                    break;
                case 2:
                    System.exit(0);
        }

        }
        while (onPromptInt != 1 );

    }
}
