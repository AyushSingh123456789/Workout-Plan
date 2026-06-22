import Days.*;
import java.util.Scanner;

public class WorkoutPlan {
    public static void main(String[] args) {

        String choice;
        System.out.println("Enter today's day: ");
        Scanner s1 = new Scanner(System.in);
        choice = s1.nextLine();

        if (choice.equalsIgnoreCase("monday")) {
            Monday m1 = new Monday();
            m1.Day1();
        } else if (choice.equalsIgnoreCase("tuesday")) {
            Tuesday t1 = new Tuesday();
            t1.Day2();
        } else if (choice.equalsIgnoreCase("wednesday")) {
            Wednesday w1 = new Wednesday();
            w1.Day3();
        } else if (choice.equalsIgnoreCase("thursday")) {
            Thursday td1 = new Thursday();
            td1.Day4();
        } else if (choice.equalsIgnoreCase("friday")) {
            Friday f1 = new Friday();
            f1.Day5();
        } else if (choice.equalsIgnoreCase("saturday")) {
            Saturday ss1 = new Saturday();
            ss1.Day6();
        } else if (choice.equalsIgnoreCase("sunday")) {
            Sunday sd1 = new Sunday();
            sd1.Day7();
        }
    }
}
