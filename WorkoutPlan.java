import java.util.Scanner;

class theStarter {
    // The problem I dealt from using a Constructor here-:

    /*
     * a common pattern that is problematic is trying to instantiate a subclass
     * within the superclass's constructor, as this can lead to an infinite loop
     * (the subclass constructor calls the superclass constructor, which tries to
     * call the subclass constructor again)
     */

    public void startScreen() {
        System.out.println("Welcome to Your Workout Schedule, \nEnter today's day: ");

        String choice1;
        Scanner ss1 = new Scanner(System.in);
        choice1 = ss1.nextLine();

        if (choice1.equalsIgnoreCase("Monday")) {
            theWeek w1 = new theWeek();
            w1.Monday();
        } else if (choice1.equalsIgnoreCase("Tuesday")) {
            theWeek w2 = new theWeek();
            w2.Tuesday();
        } else if (choice1.equalsIgnoreCase("Wednesday")) {
            theWeek w3 = new theWeek();
            w3.Wednesday();
        } else if (choice1.equalsIgnoreCase("Thursday")) {
            theWeek w4 = new theWeek();
            w4.Thursday();
        } else if (choice1.equalsIgnoreCase("Friday")) {
            theWeek w5 = new theWeek();
            w5.Friday();
        } else if (choice1.equalsIgnoreCase("Saturday")) {
            theWeek w6 = new theWeek();
            w6.Saturday();
        } else if (choice1.equalsIgnoreCase("Sunday")) {
            theWeek w7 = new theWeek();
            w7.Sunday();
        }
        ss1.close();
    }
}

class theWeek extends theStarter {
    public void Monday() {
        System.out.println("Today is your Chest and Calves day");
        System.out.println(
                "1. Warmup Pushups(4 Sets), \n2. Dumbbell Flies(4 Sets), \n3. Dumbbell Decline Press(4 Sets), \n4. Dumbbell Pullovers(4 Sets), \n5.Dumbbell decline press(4 Sets), \n6.Dumbbell Calf Raises(4 Sets");
        int setCount = 0;
        String setConfirmation;
        for (int i = 0; i < 4; i++) { // exercise1
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss2 = new Scanner(System.in);
            setConfirmation = ss2.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss3 = new Scanner(System.in);
                setConfirmation2 = ss3.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Monday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss3.close();
            }
            // ss2.close();

        }
        System.out.println(
                "1. Warmup Pushups(4 Sets), \n2. Dumbbell Flies(4 Sets), \n3. Dumbbell Decline Press(4 Sets), \n4. Dumbbell Pullovers(4 Sets), \n5.Dumbbell decline press(4 Sets), \n6.Dumbbell Calf Raises(4 Sets");
        System.out.println("Now it's time for Exercise number 2");

        for (int i = 0; i < 4; i++) { // exercise 2
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss2 = new Scanner(System.in);
            setConfirmation = ss2.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss3 = new Scanner(System.in);
                setConfirmation2 = ss3.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Monday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss3.close();
            }
            // ss2.close();
        }
        System.out.println(
                "1. Warmup Pushups(4 Sets), \n2. Dumbbell Flies(4 Sets), \n3. Dumbbell Decline Press(4 Sets), \n4. Dumbbell Pullovers(4 Sets), \n5.Dumbbell decline press(4 Sets), \n6.Dumbbell Calf Raises(4 Sets");
        System.out.println("Now it's time for Exercise 3");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss2 = new Scanner(System.in);
            setConfirmation = ss2.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss3 = new Scanner(System.in);
                setConfirmation2 = ss3.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Monday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss3.close();
            }
            // ss2.close();
        }

        System.out.println(
                "1. Warmup Pushups(4 Sets), \n2. Dumbbell Flies(4 Sets), \n3. Dumbbell Decline Press(4 Sets), \n4. Dumbbell Pullovers(4 Sets), \n5.Dumbbell decline press(4 Sets), \n6.Dumbbell Calf Raises(4 Sets");
        System.out.println("Now it's time for Exercise number 4");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss2 = new Scanner(System.in);
            setConfirmation = ss2.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss3 = new Scanner(System.in);
                setConfirmation2 = ss3.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Monday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss3.close();
            }
            // ss2.close();
        }

        System.out.println(
                "1. Warmup Pushups(4 Sets), \n2. Dumbbell Flies(4 Sets), \n3. Dumbbell Decline Press(4 Sets), \n4. Dumbbell Pullovers(4 Sets), \n5.Dumbbell decline press(4 Sets), \n6.Dumbbell Calf Raises(4 Sets");
        System.out.println("Now, it's time for Exercise number 5");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss2 = new Scanner(System.in);
            setConfirmation = ss2.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss3 = new Scanner(System.in);
                setConfirmation2 = ss3.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Monday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss3.close();
            }
            // ss2.close();
        }

        System.out.println(
                "1. Warmup Pushups(4 Sets), \n2. Dumbbell Flies(4 Sets), \n3. Dumbbell Decline Press(4 Sets), \n4. Dumbbell Pullovers(4 Sets), \n5.Dumbbell decline press(4 Sets), \n6.Dumbbell Calf Raises(4 Sets");
        System.out.println("Now, it's time for Exercise number 6");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss2 = new Scanner(System.in);
            setConfirmation = ss2.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss3 = new Scanner(System.in);
                setConfirmation2 = ss3.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Monday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss3.close();
            }
            // ss2.close();
        }
        System.out.println("Congratulations, Your Workout of the Day is Done");
    }

    public void Tuesday() {
        System.out.println("Today is your Legs day");
        System.out.println(
                "1. Warmup Squats(4 Sets), \n2. Dumbbell Lunges(4 Sets), \n3. Dumbbell front Squats(4 Sets), \n4. Dumbbell Hamstring Stepups(4 Sets), \n5. Dumbbell Goblet Squats(4 Sets), \n6. Dumbbell Deadlift(4 Sets");
        int setCount = 0;
        String setConfirmation;
        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss4 = new Scanner(System.in);
            setConfirmation = ss4.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss5 = new Scanner(System.in);
                setConfirmation2 = ss5.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Tuesday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss5.close();
            }
        }

        System.out.println(
                "1. Warmup Squats(4 Sets), \n2. Dumbbell Lunges(4 Sets), \n3. Dumbbell front Squats(4 Sets), \n4. Dumbbell Hamstring Stepups(4 Sets), \n5. Dumbbell Goblet Squats(4 Sets), \n6. Dumbbell Deadlift(4 Sets");
        System.out.println("Now, it's time for Exercise number 2");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss4 = new Scanner(System.in);
            setConfirmation = ss4.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss5 = new Scanner(System.in);
                setConfirmation2 = ss5.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Tuesday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss5.close();
            }
        }
        System.out.println(
                "1. Warmup Squats(4 Sets), \n2. Dumbbell Lunges(4 Sets), \n3. Dumbbell front Squats(4 Sets), \n4. Dumbbell Hamstring Stepups(4 Sets), \n5. Dumbbell Goblet Squats(4 Sets), \n6. Dumbbell Deadlift(4 Sets");
        System.out.println("Now, it's time for Exercise number 3");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss4 = new Scanner(System.in);
            setConfirmation = ss4.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss5 = new Scanner(System.in);
                setConfirmation2 = ss5.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Tuesday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss5.close();
            }
        }

        System.out.println(
                "1. Warmup Squats(4 Sets), \n2. Dumbbell Lunges(4 Sets), \n3. Dumbbell front Squats(4 Sets), \n4. Dumbbell Hamstring Stepups(4 Sets), \n5. Dumbbell Goblet Squats(4 Sets), \n6. Dumbbell Deadlift(4 Sets");
        System.out.println("Now, it's time for Exercise number 4");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss4 = new Scanner(System.in);
            setConfirmation = ss4.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss5 = new Scanner(System.in);
                setConfirmation2 = ss5.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Tuesday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss5.close();
            }
        }

        System.out.println(
                "1. Warmup Squats(4 Sets), \n2. Dumbbell Lunges(4 Sets), \n3. Dumbbell front Squats(4 Sets), \n4. Dumbbell Hamstring Stepups(4 Sets), \n5. Dumbbell Goblet Squats(4 Sets), \n6. Dumbbell Deadlift(4 Sets");
        System.out.println("Now, it's time for Exercise number 5");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss4 = new Scanner(System.in);
            setConfirmation = ss4.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss5 = new Scanner(System.in);
                setConfirmation2 = ss5.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Tuesday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss5.close();
            }
        }

        System.out.println(
                "1. Warmup Squats(4 Sets), \n2. Dumbbell Lunges(4 Sets), \n3. Dumbbell front Squats(4 Sets), \n4. Dumbbell Hamstring Stepups(4 Sets), \n5. Dumbbell Goblet Squats(4 Sets), \n6. Dumbbell Deadlift(4 Sets");
        System.out.println("Now, it's time for Exercise number 6");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss4 = new Scanner(System.in);
            setConfirmation = ss4.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss5 = new Scanner(System.in);
                setConfirmation2 = ss5.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Tuesday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss5.close();
            }
        }
        System.out.println("Congratulations, Your Workout of the Day is Done");
    }

    public void Wednesday() {
        System.out.println("Today is your Arms day");
        System.out.println(
                "1. DB Curls(4 Sets), \n2. DB Inward Curls(4 Sets), \n3. Db Hammer Curls(4 Sets), \n4. Db Overhead Extensions(4 Sets), \n5. Db KickBacks(4 Sets), \n6. Db Skull Crushers(4 Sets)");
        int setCount = 0;
        String setConfirmation;
        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss6 = new Scanner(System.in);
            setConfirmation = ss6.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss7 = new Scanner(System.in);
                setConfirmation2 = ss7.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Wednesday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss7.close();
            }

        }
        System.out.println(
                "1. DB Curls(4 Sets), \n2. DB Inward Curls(4 Sets), \n3. Db Hammer Curls(4 Sets), \n4. Db Overhead Extensions(4 Sets), \n5. Db KickBacks(4 Sets), \n6. Db Skull Crushers(4 Sets)");
        System.out.println("Now, it's time for Exercise number 2");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss6 = new Scanner(System.in);
            setConfirmation = ss6.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss7 = new Scanner(System.in);
                setConfirmation2 = ss7.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Wednesday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss7.close();
            }
        }

        System.out.println(
                "1. DB Curls(4 Sets), \n2. DB Inward Curls(4 Sets), \n3. Db Hammer Curls(4 Sets), \n4. Db Overhead Extensions(4 Sets), \n5. Db KickBacks(4 Sets), \n6. Db Skull Crushers(4 Sets)");
        System.out.println("Now, it's time for Exercise number 3");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss6 = new Scanner(System.in);
            setConfirmation = ss6.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss7 = new Scanner(System.in);
                setConfirmation2 = ss7.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Wednesday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss7.close();
            }
        }

        System.out.println(
                "1. DB Curls(4 Sets), \n2. DB Inward Curls(4 Sets), \n3. Db Hammer Curls(4 Sets), \n4. Db Overhead Extensions(4 Sets), \n5. Db KickBacks(4 Sets), \n6. Db Skull Crushers(4 Sets)");
        System.out.println("Now, it's time for Exercise number 4");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss6 = new Scanner(System.in);
            setConfirmation = ss6.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss7 = new Scanner(System.in);
                setConfirmation2 = ss7.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Wednesday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss7.close();
            }
        }

        System.out.println(
                "1. DB Curls(4 Sets), \n2. DB Inward Curls(4 Sets), \n3. Db Hammer Curls(4 Sets), \n4. Db Overhead Extensions(4 Sets), \n5. Db KickBacks(4 Sets), \n6. Db Skull Crushers(4 Sets)");
        System.out.println("Now, it's time for Exercise number 5");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss6 = new Scanner(System.in);
            setConfirmation = ss6.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss7 = new Scanner(System.in);
                setConfirmation2 = ss7.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Wednesday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss7.close();
            }
        }

        System.out.println(
                "1. DB Curls(4 Sets), \n2. DB Inward Curls(4 Sets), \n3. Db Hammer Curls(4 Sets), \n4. Db Overhead Extensions(4 Sets), \n5. Db KickBacks(4 Sets), \n6. Db Skull Crushers(4 Sets)");
        System.out.println("Now, it's time for Exercise number 6");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss6 = new Scanner(System.in);
            setConfirmation = ss6.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss7 = new Scanner(System.in);
                setConfirmation2 = ss7.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Wednesday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss7.close();
            }
        }
        System.out.println("Congratulations, Your Workout of the Day is Done");
    }

    public void Thursday() {
        System.out.println("Today is your Back and Traps day");
        System.out.println(
                "1. Db Single Arm Rows(4 Sets), \n2. Db Bent Over rows(4 Sets), \n3. Db Wide pulldowns(4 Sets), \n4. Heavy Db Goblet rows(4 Sets), \n5. Db Pullovers(4 Sets), \n6. Db Deadlift(4 Sets), \n7 Db Shrugs(4 Sets");

        int setCount = 0;
        String setConfirmation;
        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss8 = new Scanner(System.in);
            setConfirmation = ss8.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss9 = new Scanner(System.in);
                setConfirmation2 = ss9.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Thursday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss9.close();
            }
        }

        System.out.println(
                "1. Db Single Arm Rows(4 Sets), \n2. Db Bent Over rows(4 Sets), \n3. Db Wide pulldowns(4 Sets), \n4. Heavy Db Goblet rows(4 Sets), \n5. Db Pullovers(4 Sets), \n6. Db Deadlift(4 Sets), \n7 Db Shrugs(4 Sets)");
        System.out.println("Now, it's time for Exercise number 2");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss8 = new Scanner(System.in);
            setConfirmation = ss8.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss9 = new Scanner(System.in);
                setConfirmation2 = ss9.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Thursday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss9.close();
            }
        }

        System.out.println(
                "1. Db Single Arm Rows(4 Sets), \n2. Db Bent Over rows(4 Sets), \n3. Db Wide pulldowns(4 Sets), \n4. Heavy Db Goblet rows(4 Sets), \n5. Db Pullovers(4 Sets), \n6. Db Deadlift(4 Sets), \n7 Db Shrugs(4 Sets)");
        System.out.println("Now, it's time for Exercise number 3");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss8 = new Scanner(System.in);
            setConfirmation = ss8.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss9 = new Scanner(System.in);
                setConfirmation2 = ss9.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Thursday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss9.close();
            }
        }

        System.out.println(
                "1. Db Single Arm Rows(4 Sets), \n2. Db Bent Over rows(4 Sets), \n3. Db Wide pulldowns(4 Sets), \n4. Heavy Db Goblet rows(4 Sets), \n5. Db Pullovers(4 Sets), \n6. Db Deadlift(4 Sets), \n7 Db Shrugs(4 Sets)");
        System.out.println("Now, it's time for Exercise number 4");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss8 = new Scanner(System.in);
            setConfirmation = ss8.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss9 = new Scanner(System.in);
                setConfirmation2 = ss9.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Thursday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss9.close();
            }
        }

        System.out.println(
                "1. Db Single Arm Rows(4 Sets), \n2. Db Bent Over rows(4 Sets), \n3. Db Wide pulldowns(4 Sets), \n4. Heavy Db Goblet rows(4 Sets), \n5. Db Pullovers(4 Sets), \n6. Db Deadlift(4 Sets), \n7 Db Shrugs(4 Sets)");
        System.out.println("Now it's time for Exercise number 5");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss8 = new Scanner(System.in);
            setConfirmation = ss8.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss9 = new Scanner(System.in);
                setConfirmation2 = ss9.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Thursday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss9.close();
            }
        }

        System.out.println(
                "1. Db Single Arm Rows(4 Sets), \n2. Db Bent Over rows(4 Sets), \n3. Db Wide pulldowns(4 Sets), \n4. Heavy Db Goblet rows(4 Sets), \n5. Db Pullovers(4 Sets), \n6. Db Deadlift(4 Sets), \n7 Db Shrugs(4 Sets)");
        System.out.println("Now, it's time for Exercise number 6");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss8 = new Scanner(System.in);
            setConfirmation = ss8.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss9 = new Scanner(System.in);
                setConfirmation2 = ss9.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Thursday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss9.close();
            }
        }

        System.out.println(
                "1. Db Single Arm Rows(4 Sets), \n2. Db Bent Over rows(4 Sets), \n3. Db Wide pulldowns(4 Sets), \n4. Heavy Db Goblet rows(4 Sets), \n5. Db Pullovers(4 Sets), \n6. Db Deadlift(4 Sets), \n7 Db Shrugs(4 Sets)");
        System.out.println("Now, it's time for Exercise number 7");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss8 = new Scanner(System.in);
            setConfirmation = ss8.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss9 = new Scanner(System.in);
                setConfirmation2 = ss9.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Thursday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss9.close();
            }
        }
        System.out.println("Congratulations, Your Workout of the Day is Done");
    }

    public void Friday() {
        System.out.println("Today is your Shoulder day");
        System.out.println(
                "1. Bent Over Db delt flies(4 Sets), \n2. Db Lateral Raises(4 Sets), \n3. Db Shoulder Presses(4 Sets), \n4. Db Seated Delt flies(4 Sets), \n5. Db Front Raises(4 Sets)");

        int setCount = 0;
        String setConfirmation;
        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss10 = new Scanner(System.in);
            setConfirmation = ss10.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss11 = new Scanner(System.in);
                setConfirmation2 = ss11.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Friday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss11.close();
            }
        }

        System.out.println(
                "1. Bent Over Db delt flies(4 Sets), \n2. Db Lateral Raises(4 Sets), \n3. Db Shoulder Presses(4 Sets), \n4. Db Seated Delt flies(4 Sets), \n5. Db Front Raises(4 Sets)");
        System.out.println("Now, it's time for Exercise number 2");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss10 = new Scanner(System.in);
            setConfirmation = ss10.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss11 = new Scanner(System.in);
                setConfirmation2 = ss11.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Friday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss11.close();
            }
        }

        System.out.println(
                "1. Bent Over Db delt flies(4 Sets), \n2. Db Lateral Raises(4 Sets), \n3. Db Shoulder Presses(4 Sets), \n4. Db Seated Delt flies(4 Sets), \n5. Db Front Raises(4 Sets)");
        System.out.println("Now, it's time for Exercise number 3");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss10 = new Scanner(System.in);
            setConfirmation = ss10.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss11 = new Scanner(System.in);
                setConfirmation2 = ss11.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Friday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss11.close();
            }
        }

        System.out.println(
                "1. Bent Over Db delt flies(4 Sets), \n2. Db Lateral Raises(4 Sets), \n3. Db Shoulder Presses(4 Sets), \n4. Db Seated Delt flies(4 Sets), \n5. Db Front Raises(4 Sets)");
        System.out.println("Now, it's time for Exercise number 4");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss10 = new Scanner(System.in);
            setConfirmation = ss10.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss11 = new Scanner(System.in);
                setConfirmation2 = ss11.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Friday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss11.close();
            }
        }

        System.out.println(
                "1. Bent Over Db delt flies(4 Sets), \n2. Db Lateral Raises(4 Sets), \n3. Db Shoulder Presses(4 Sets), \n4. Db Seated Delt flies(4 Sets), \n5. Db Front Raises(4 Sets)");
        System.out.println("Now, it's time for Exercise number 5");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss10 = new Scanner(System.in);
            setConfirmation = ss10.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss11 = new Scanner(System.in);
                setConfirmation2 = ss11.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Friday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss11.close();
            }
        }
        System.out.println("Congratulations, Your Workout of the Day is Done");

    }

    public void Saturday() {
        System.out.println("Today is your Chest day");
        System.out.println(
                "1. Warmup Pushups(4 Sets), \n2. Db Presses(4 Sets), \n3. Db Pullovers(4 Sets), \n4. Db Decline Flies(4 Sets");

        int setCount = 0;
        String setConfirmation;
        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss12 = new Scanner(System.in);
            setConfirmation = ss12.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss13 = new Scanner(System.in);
                setConfirmation2 = ss13.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Saturday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss13.close();
            }
        }

        System.out.println(
                "1. Warmup Pushups(4 Sets), \n2. Db Presses(4 Sets), \n3. Db Pullovers(4 Sets), \n4. Db Decline Flies(4 Sets");
        System.out.println("Now, it's time for Exercise 2");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss12 = new Scanner(System.in);
            setConfirmation = ss12.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss13 = new Scanner(System.in);
                setConfirmation2 = ss13.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Saturday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss13.close();
            }
        }

        System.out.println(
                "1. Warmup Pushups(4 Sets), \n2. Db Presses(4 Sets), \n3. Db Pullovers(4 Sets), \n4. Db Decline Flies(4 Sets");
        System.out.println("Now, it's time for Exercise number 3");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss12 = new Scanner(System.in);
            setConfirmation = ss12.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss13 = new Scanner(System.in);
                setConfirmation2 = ss13.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Saturday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss13.close();
            }
        }

        System.out.println(
                "1. Warmup Pushups(4 Sets), \n2. Db Presses(4 Sets), \n3. Db Pullovers(4 Sets), \n4. Db Decline Flies(4 Sets");
        System.out.println("Now, it's time for Exercise number 4");

        for (int i = 0; i < 4; i++) {
            setCount = i + 1;
            System.out.println("Start your set number " + setCount);
            System.out.println("Press Y/y if the set is done: ");
            Scanner ss12 = new Scanner(System.in);
            setConfirmation = ss12.nextLine();

            if (setConfirmation.matches("[yY]")) {
                System.out.println("Set " + setCount + " done");
            } else {
                System.out.println("Invalid input, Press 1 to Try Again, Press anything else to Exit the program");
                int setConfirmation2;
                Scanner ss13 = new Scanner(System.in);
                setConfirmation2 = ss13.nextInt();
                if (setConfirmation2 == 1) {
                    theWeek w2 = new theWeek();
                    w2.Saturday();
                } else {
                    System.out.println("Exiting the Program");
                    System.exit(0);
                }
                ss13.close();
            }
        }
        System.out.println("Congratulations Your Workout of the Day is Done");

    }

    public void Sunday() {
        System.out.println("Today is your Cardio + Abs day");
        System.out.println("Train along with the abs training videos from GainsByBrains Youtube Channel");
    }
}

public class WorkoutPlan {
    public static void main(String[] args) {
        theWeek www = new theWeek();
        www.startScreen();

        /*
         * Note: Use .equals() or .equalIgnoreCase() when comparing two Strings, and Use
         * .matches("[]") when comparing characters, symbols, numbers, bunch of
         * characters on an Individual level too.
         */
    }
}