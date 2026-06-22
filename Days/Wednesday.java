package Days;

import java.util.Scanner;

public class Wednesday {
    public void Day3() {
        int sets, reps;
        System.out.println("Today is your Arms day");
        System.out.println(
                "1. DB Curls, \n2. DB Inward Curls, \n3. Db Hammer Curls, \n4. Db Overhead Extensions, \n5. Db KickBacks, \n6. Db Skull Crushers");
        System.out.println("Enter the number of sets and reps: ");
        Scanner s4 = new Scanner(System.in);
        sets = s4.nextInt();
        reps = s4.nextInt();

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
