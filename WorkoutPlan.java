import java.util.Scanner;

class Days {

    void Monday() {
        System.out.println("Today is Chest and Calves Day, The Exercises for today are-: ");
        System.out.print(
                "1. WarmUp Pushups(3-4 Sets), \n2. Dumbbell Presses(4-5 Sets), \n3. Dumbbell Flies(4-5 Sets), \n4. Dumbbell PullOvers(4-5 Sets), \5. Dumbell Decline Flies(4-5 Sets), \n6. Db Decline Press(4-5 Sets), \n7. Dumbbell Calf Raises(Standing or Seated)(4-5 Sets)");

        System.out.println("Press Y if U wanna Start the Chest day: ");
        String Confirmation1;
        Scanner s2 = new Scanner(System.in);
        Confirmation1 = s2.nextLine();
        if (Confirmation1.matches("[Yy]+")) {
            Days d1 = new Days();
            d1.WarmupPushups();
            d1.DumbbellPresses();
        } else {
            System.out.println("Wrong Input, Exiting the System");
            System.exit(0);
        }
    }

    void WarmupPushups() {
        int sets = 0;
        int CurrentIteration = 0;

        while (sets < 4) {
            System.out.println("Start the Sets");
            System.out.println("Press Y if the Set is done: ");
            String setConfirmation;
            Scanner s3 = new Scanner(System.in);
            setConfirmation = s3.nextLine();

            // Current Iteration Checking -:

            for (int i = 0; i < 4; i++) {
                CurrentIteration = i;
            }

            if (setConfirmation.matches("[Yy]+")) {
                sets++;
                continue;
            } else if (setConfirmation.matches("[nN]") && CurrentIteration == 3) {
                System.out.println("Okay, I will take 3 Sets for Today");
                break;
            }

            else {
                System.out.println("Wrong Input, Exiting the System");
                System.exit(0);
            }
        }
        System.out.println("Well Done, The 1st Exercise is Done, \nMoving to the Next One ");
    }

    void DumbbellPresses() {

    }

}

class StartScreen {
    System.out.println("Choose from the Options below: ");

    System.out.println("1. Monday, \n2. Tuesday, \n3. Wednesday, \n4. Thursday, \n5. Friday, \n6. Saturday");

    int choice1;
    Scanner s1 = new Scanner(System.in);choice1=s1.nextInt();

    if(choice1==1){Days m1=new Days();}

}

public class WorkoutPlan {
    public static void main(String[] args) {

    }

}
