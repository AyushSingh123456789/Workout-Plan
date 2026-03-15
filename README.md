# 🏋️‍♂️ WorkoutPlan  
**Your Personal Daily Workout Companion**  

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Console App](https://img.shields.io/badge/Console%20App-Terminal-green?style=for-the-badge)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)

---

## ✨ Overview

**WorkoutPlan** is a clean, interactive Java console application designed to help you stay consistent with your gym routine.  

Just tell it the day of the week and it will:
- Show your exact workout for that day (with all exercises & sets)
- Guide you **set by set**
- Wait for your confirmation (`Y/y`)
- Handle mistakes gracefully (retry or exit)
- Celebrate when you finish the day! 🎉

Perfect for beginners who want structure without needing a phone app or fancy UI.

---

## 📋 Features

- ✅ **7-Day Split** – Chest & Calves, Legs, Arms, Back & Traps, Shoulders, Chest (light), Cardio + Abs
- ✅ **Real-time Set Tracker** – Tracks every single set (4 sets per exercise)
- ✅ **Smart Input Validation** – Only accepts `Y/y` or gives retry option
- ✅ **Retry/Early Exit** – Press `1` to restart the day or anything else to quit
- ✅ **Clean & Motivating Output** – Clear exercise names, rest reminders, and success messages
- ✅ **Zero Dependencies** – Pure Java, runs anywhere Java is installed

---

## 🗓️ Your Weekly Workout Schedule

| Day         | Focus                  | Exercises |
|-------------|------------------------|---------|
| **Monday**    | Chest & Calves        | Pushups, Dumbbell Flies, Decline Press, Pullovers, Calf Raises |
| **Tuesday**   | Legs                  | Squats, Lunges, Front Squats, Hamstring Step-ups, Goblet Squats, Deadlift |
| **Wednesday** | Arms                  | DB Curls, Inward Curls, Hammer Curls, Overhead Extensions, Kickbacks, Skull Crushers |
| **Thursday**  | Back & Traps          | Single Arm Rows, Bent Over Rows, Wide Pulldowns, Goblet Rows, Pullovers, Deadlift, Shrugs |
| **Friday**    | Shoulders             | Bent Over Delt Flies, Lateral Raises, Shoulder Presses, Seated Delt Flies, Front Raises |
| **Saturday**  | Chest (Light)         | Pushups, DB Presses, Pullovers, Decline Flies |
| **Sunday**    | Cardio + Abs          | Follow GainsByBrains YouTube abs videos |

---

## 🚀 How to Run

### 1. Clone the repo
```bash
git clone https://github.com/yourusername/WorkoutPlan.git
cd WorkoutPlan
javac WorkoutPlan.java
java WorkoutPlan

That's it! No build tools, no Maven, no nothing.
Minimum requirement: Java 8 or higher (tested on Java 17+)

📸 Usage Demo (Terminal)

Welcome to Your Workout Schedule,
Enter today's day: Monday

Today is your Chest and Calves day
1. Warmup Pushups(4 Sets), 
2. Dumbbell Flies(4 Sets), ...

Start your set number 1
Press Y/y if the set is done: Y
Set 1 done
...
Congratulations, Your Workout of the Day is Done! 💪

🛠️ Project Structure
WorkoutPlan/
├── WorkoutPlan.java          ← Main class
├── theStarter.java           ← Start screen logic
├── theWeek.java              ← All day-specific workouts
└── README.md                 ← You're reading it!

🎯 Why I Built This
I got tired of forgetting my workout split or scrolling through notes on my phone between sets.
This app keeps me focused, accountable, and motivated — right in the terminal while I'm at home with dumbbells.

🔮 Future Plans (Open to contributions!)
1.Save progress to a file (JSON)
 2.Add rest timers
 3.GUI version (JavaFX / Swing)
 4.Custom workout creator
 5.Dark mode console theme 😎
 6.Export workout log

🤝 Contributing
Love lifting and coding? Feel free to:

Fork the repo
Create a feature branch
Open a Pull Request

Any improvement (cleaner code, bug fixes, new features) is highly appreciated!

📄 License
This project is licensed under the MIT License — feel free to use it, modify it, and share it.

👤 Author
Ayush
Patna, India
"Built with sweat, caffeine, and a lot of System.out.println()" 💪

⭐ If this helps you stay consistent at the gym, please star the repo!
Every star = one more set completed.
Let's get shredded together! 🔥
