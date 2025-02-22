# Rummy Score Calculator

## Description
The **Rummy Score Calculator** is a simple Java-based console application that helps track and manage player scores in a Rummy game. Players are eliminated when their score reaches or exceeds 251 points. The program continues until only one player remains, declaring the game over.

## Features
- Allows users to input player names at the start of the game.
- Updates scores for each player after every round.
- Eliminates players who reach or exceed 251 points.
- Displays the updated scores after every round.

## Installation
### Prerequisites
- Java Development Kit (JDK) 8 or later installed on your system.

### Steps
1. Download or clone the repository containing the `Main.java` and `Player.java` files.
2. Open a terminal or command prompt and navigate to the directory where the files are located.
3. Compile the Java files using:
   ```sh
   javac Main.java Player.java
   ```
4. Run the program with:
   ```sh
   java Main
   ```

## How to Use
1. When prompted, enter player names one by one.
2. Press **Enter** on an empty input to start the game.
3. After each round, enter the score for each player when prompted.
4. If a player reaches 251 points or more, they are eliminated.
5. The game continues until only one player remains, at which point the game ends.

## Example Run
```
Rummy Score Calculator

Player Name: Alice
Player Name: Bob
Player Name: Charlie
Player Name:

Alice gets 30
Bob gets 45
Charlie gets 60

Alice has a score of 30
Bob has a score of 45
Charlie has a score of 60

...

Charlie is eliminated with a score of 255
Game Over.
```
