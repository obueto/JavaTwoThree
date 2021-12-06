/*
package chapterTwo;

import java.util.Scanner;

//For sub menu, there is a do while
//In every do-while, you display, you collect input, and you do your switch case

public class MobilePhone {
    public static void main(String[] args) {
        String option = """
                -> PhoneBook  Press 1
                -> Message    Press 2
                -> Chat       Press 3
                -> Call       Press 4
                -> Profile    Press 5
                -> Sim        Press 6
                -> Clock      press 7
                -> Tones      Press 8
                -> Settings   Press 9
                -> Reminders  Press 10
                -> Calculator Press 11
                -> Call Divert  Press 12
                -> Games Press 13
                """;

        System.out.println(option);
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Phone Book");
                String phonebookMenu = """
                        Enter 1 to Search
                        Enter 2 to Service nos
                        Enter 3 to Add name
                        Enter 4 to Erase
                        Enter 5 to Assign Tone
                        Enter 6 to Send Birthday Card
                        Enter 7 to Edit
                        Enter 8 to Options
                        Enter 9 to Speed dail
                        Enter 10 to Voice tags
                        Enter 11 to Exit
                        """;

                    System.out.println(phonebookMenu);
                    int phoneBookInput = input.nextInt();
                    switch (phoneBookInput) {
                        case 1 -> System.out.println("Search");
                        case 2 -> System.out.println("Service nos");
                        case 3 -> System.out.println("Add name");
                        case 4 -> System.out.println("Erase");
                        case 5 -> System.out.println("Assign Tone");
                        case 6 -> System.out.println("Send Birthday Card");
                        case 7 -> System.out.println("Edit");
                        case 8 -> {
                            System.out.println("Options");
                            String optionsMenu = """
                                    -> 1 Type of view
                                    -> 2 Memory Status
                                    -> 3 Exit
                                    """;



                                System.out.println(optionsMenu);
                                int optionsInput = input.nextInt();

                                switch (optionsInput) {
                                    case 1 -> System.out.println("Type of View");
                                    case 2 -> System.out.println("Memory Status");
                                    case 3 -> System.out.println("Exit");
                                }

                        }
                        case 9 -> System.out.println("Speed dials");
                        case 10 -> System.out.println("Voice tags");
                    }



            case 2:
                System.out.println("Messages");
                String MessageMenu = """
                        Enter 1 to Write messages
                        Enter 2 for Inbox
                        Enter 3 for Outbox
                        Enter 4 for Picture messages
                        Enter 5 for Templates
                        Enter 6 for Smileys
                        Enter 7 for  Message settings
                        Enter 8 for Info Service
                        Enter 9 for  Voice mailbox number
                        Enter 10 for Service command editor
                        Enter 11 to Exit

                        """;

                System.out.println(MessageMenu);
               int  messageInput = input.nextInt();
                switch (messageInput) {
                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                    case 4:
                        System.out.println("Picture messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7: {
                        System.out.println("Message settings");
                        String messageSettingMenu = """
                                1 -> Set
                                2 -> Common
                                3 -> Exit
                                """;
                        System.out.println(messageSettingMenu);



                           int messageSettingInput = input.nextInt();
                            switch (messageSettingInput) {
                                case 1 -> {
                                    System.out.println("Set");
                                    String setMenu = """
                                            1 Message centre number
                                            2 Message sent as
                                            3 Message validity
                                            4 Exit
                                            """;
                                    System.out.println(setMenu);


                                    int setMenuInput = input.nextInt();
                                    switch (setMenuInput) {

                                        case 1:
                                            System.out.println("Message centre number");
                                            break;
                                        case 2:
                                            System.out.println("Message sent as");
                                            break;
                                        case 3:
                                            System.out.println("Message validity");
                                            break;
                                        case 4:
                                            System.out.println("End");
                                            break;
                                    }

                                    case 2 :
                                    System.out.println("Common");
                                    String commonMenu = """
                                            1 Delivery report
                                            2 Reply via same centre
                                            3 Character support
                                            4 Exit
                                            """;

                                    System.out.println(commonMenu);
                                    int commonInput = input.nextInt();
                                    switch (commonInput) {
                                        case 1:
                                            System.out.println("Delivery report");
                                            break;
                                        case 2:
                                            System.out.println("Reply via same centre");
                                            break;
                                        case 3:
                                            System.out.println("Character support");
                                            break;
                                        case 4:
                                            System.out.println("Exit");
                                            break;
                                    }
                                    case 3:

                                }

                    case
                                                System.out.println("Info service");
                                                break;
                                            case 9:
                                                System.out.println("Voice mailbox number");
                                                break;
                                            case 10:
                                                System.out.println("Service command editor");
                                                break;


                                            case 3:
                                                System.out.println("Chat");
                                                break;


                                            case 4:
                                                System.out.println("Call register");
                                                String callRegisterMenu = """
                                                1 Missed calls
                                                2 Received calls
                                                3 Dialled number
                                                4 Erase recent call lists
                                                5 Show call duration
                                                """;

                                        }

                                    }
                                }
                            }

                        }
                    }
                    }
                    }

                    }
                }

    */