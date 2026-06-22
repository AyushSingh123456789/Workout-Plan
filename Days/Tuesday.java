package Days;

import java.util.Scanner;

public class Tuesday {

    public void Day2() {
        int sets, reps;
        System.out.println("Today is your Legs day");
        System.out.println(
                "1. Warmup Squats \n2. Dumbbell Lunges, \n3. Dumbbell front Squats, \n4. Dumbbell Hamstring Stepups, \n5. Dumbbell Goblet Squats, \n6. Dumbbell Deadlift");
        System.out.println("Enter the number of Sets and Reps: ");
        Scanner s3 = new Scanner(System.in);
        sets = s3.nextInt();
        reps = s3.nextInt();
        // int y = 1;

        for (int j = 1; j <= 6; j++) {
            for (int i = 1; i < sets + 1; i++) {
                System.out.println("Start your exercise number " + j + " and set number " + i);
                String choice1;
                System.out.println("Type y/Y if the set " + i + " is done: ");
                Scanner s2 = new Scanner(System.in);
                choice1 = s2.nextLine();
                if (choice1.matches("[yY]") || choice1.isEmpty()) {
                    // y++;
                    System.out.println("Take a Rest of 45 Seconds before beginning the next Set");
                    for (int x = 45; x >= 0; x--) {
                        System.out.println("\rRest time remaining: " + x + " seconds...");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ie) {
                            System.out.println("\nTimer was Interrupted!");
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    if (j < 6) {
                        System.out.println(" Time's up! Get ready for the next set or next exercise");
                    } else {
                        System.out
                                .println("All your Exercises for the day have been completed successfully, WELL DONE");
                    }
                } else {
                    System.out.println("Exiting the program");
                    System.exit(0);
                }
            }
        }

    }
}
