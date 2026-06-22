# Workout Plan Application

A Java-based command-line workout planner that provides daily exercise routines with interactive set and rep tracking, along with automated rest period management. This project demonstrates clean code organization using Java packages to optimize a previously unstructured codebase.

## Description

The Workout Plan Application is an interactive fitness trainer that guides users through their daily workout routines. The application:

- **Prompts users** to specify the current day of the week
- **Displays customized exercises** for that specific day (e.g., Chest and Calves on Monday)
- **Tracks sets and repetitions** with user confirmation
- **Manages rest periods** automatically with a countdown timer between sets
- **Provides structured guidance** throughout each workout session

Each day features a unique combination of exercises targeting different muscle groups, ensuring a well-balanced weekly workout program.

## Project Structure

The project utilizes a package-based architecture to maintain clean separation of concerns:

```
WorkoutProj/
├── WorkoutPlan.java          # Main entry point and day selection logic
├── Days/                      # Package containing daily workout routines
│   ├── Monday.java           # Chest and Calves workout
│   ├── Tuesday.java          # Leg workout
│   ├── Wednesday.java        # Back and Shoulders workout
│   ├── Thursday.java         # Arms workout
│   ├── Friday.java           # Chest and Triceps workout
│   ├── Saturday.java         # Legs and Core workout
│   └── Sunday.java           # Active recovery or light cardio
└── README.md                 # This file
```

### Architecture Details

- **WorkoutPlan.java**: Main class that serves as the application entry point. It handles user input and delegates to the appropriate day class.
- **Days Package**: Contains seven workout classes (one for each day of the week), each implementing a `Day#()` method with specific exercises and interactive features.

## Prerequisites

Before running this application, ensure you have the following installed:

- **Java Development Kit (JDK)** - Version 8 or higher
  - Verify installation: `java -version`
  - Download from: [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) or use your package manager

- **Java Compiler (javac)**
  - Usually comes with JDK
  - Verify installation: `javac -version`

## How to Run

### Step 1: Navigate to the Project Directory

```bash
cd WorkoutProj
```

### Step 2: Compile the Java Files

Compile all Java files including those in the Days package:

```bash
javac *.java Days/*.java
```

Or compile individually:

```bash
javac WorkoutPlan.java
javac Days/*.java
```

### Step 3: Run the Application

Execute the main program:

```bash
java WorkoutPlan
```

### Step 4: Follow the Prompts

1. When prompted, enter the current day of the week (e.g., `Monday`, `monday`, `MONDAY`)
2. Enter the number of sets you wish to perform
3. Enter the number of repetitions per set
4. Complete each exercise set as instructed
5. Type `y` or `Y` and press Enter when each set is finished
6. Follow the automatic rest timer between sets

### Example Usage

```
Enter today's day: 
monday

Today is your Chest and Calves day,
The exercises are:
1. Warmup Pushups
2. Dumbbell Flies
3. Dumbbell Decline Press
4. Dumbbell Pullovers
5. Dumbbell Decline Press
6. Dumbbell Calf Raises

Enter the number of sets and reps: 
3 12

Start your exercise number 1 and set number 1
Type y/Y if the set 1 is done: 
y

Take a Rest of 45 Seconds before beginning the next Set
```

## Features

- **Day-based workout selection**: Customized routines for each day of the week
- **Interactive set tracking**: User confirmation for completed sets
- **Automated rest periods**: Built-in countdown timer (45 seconds default between sets)
- **User-friendly interface**: Simple command-line interaction
- **Modular design**: Easy to extend with additional exercises or days

## Future Enhancements

- Add exercise difficulty levels (beginner, intermediate, advanced)
- Implement workout history and progress tracking
- Support for custom workout plans
- Exercise video links or descriptions
- Mobile or GUI interface
- Database integration for user profiles

## License

This project is provided as-is for personal fitness tracking purposes.

## Support

For issues or questions about this application, please review the code comments or consult the individual day class files for specific exercise information.
