# 🎯 Number Guessing Game – Java

A simple **Number Guessing Game** developed using **Core Java** as part of the **OASIS INFOBYTE Java Development Internship – Task 1**.

The game generates a random number between **1 and 100**, and the player has a limited number of attempts to guess the correct number.

---

## 📌 Project Overview

The Number Guessing Game is a console-based Java application where the computer selects a random number between 1 and 100.

The player gets **7 attempts** to guess the correct number.

After every guess, the program provides a hint:

* 🔽 **Too Low** – the guessed number is smaller than the secret number.
* 🔼 **Too High** – the guessed number is larger than the secret number.
* ✅ **Correct** – the guessed number matches the secret number.

The player can also choose to **play another round** after completing a game.

---

## ✨ Features

* 🎲 Random number generation
* 🔢 Number range from 1 to 100
* 🎯 Maximum 7 attempts per round
* 💡 Too High / Too Low hints
* ✅ Correct guess detection
* 📊 Attempts counter
* 🔄 Play Again option
* 🚪 Exit option
* 🖥️ Console-based user interface

---

## 🛠️ Technologies Used

* **Java**
* **IntelliJ IDEA**
* **Java Random**
* **Scanner**
* **Loops**
* **Conditional Statements**
* **Methods**

---

## 📂 Project Structure

```text
Task-1-Number-Guessing-Game
│
├── Main.java
└── README.md
```

---

## ▶️ How to Run

1. Clone or download this repository.
2. Open the project in **IntelliJ IDEA**.
3. Make sure Java/JDK is installed.
4. Open `Main.java`.
5. Run the `Main` class.
6. Enter your guesses between 1 and 100.
7. Follow the hints provided by the program.
8. After the round, choose whether to play again.

---

## 🎮 Game Rules

1. The computer randomly selects a number between **1 and 100**.
2. The player gets **7 attempts**.
3. Enter a number between 1 and 100.
4. The program displays:

   * `Too Low!`
   * `Too High!`
   * `Correct!`
5. If the correct number is guessed, the game displays the number of attempts used.
6. After the round, the player can choose **Y** to play again or **N** to exit.

---

## 📋 Sample Output

```text
I have selected a number between 1 and 100.
You have 7 attempts.

Enter your guess: 60
Too Low!
Attempts remaining: 6

Enter your guess: 90
Too High!
Attempts remaining: 5

Enter your guess: 83
Correct!
You guessed the number in 7 attempts.

---------------------------------
Round 1 completed.
Attempts used: 7
---------------------------------

Do you want to play again? (Y/N):
```

---

## 🎯 Learning Outcomes

Through this project, I gained practical experience in:

* Using Java's random number generation
* Taking user input using `Scanner`
* Implementing loops and conditions
* Creating a menu-driven console application
* Handling multiple game rounds
* Tracking the number of attempts
* Applying basic Object-Oriented and programming concepts

---

## 👩‍💻 Internship Task

**Organization:** OASIS INFOBYTE
**Internship:** Java Development Internship
**Task:** Task 1 – Number Guessing Game
**Technology:** Java

---

## 🚀 Future Enhancements

The game can be further improved by adding:

* Difficulty levels
* Custom number ranges
* Score calculation
* High-score tracking
* Graphical User Interface (GUI)
* Sound effects

---

## 📄 License

This project is created for **educational and internship purposes**.

