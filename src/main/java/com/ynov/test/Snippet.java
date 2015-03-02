package com.ynov.test;

import java.util.Random;
import java.util.Scanner;

public class Snippet {
    public static class RandomNumberGenerator {
        private Random random = new Random();
        public int getNumber() {
            return random.nextInt(10);
        }
    }

    public static class UserInput {
        Scanner s = new Scanner(System.in);
        public int getUserNumber() {
            System.out.println("Entrez un nombre");
            return s.nextInt();
        }
    }

    public static class UserOutput {
        public void writeMessage(String message) {
            System.out.println(message);
        }
    }

    public static class GameLoop {
        private final RandomNumberGenerator randomNumberGenerator;
        private final UserInput userInput;
        private final UserOutput userOutput;

        public GameLoop(RandomNumberGenerator randomNumberGenerator,
                        UserInput userInput,
                        UserOutput userOutput) {
            this.randomNumberGenerator = randomNumberGenerator;
            this.userInput = userInput;
            this.userOutput = userOutput;
        }

        public void loopForever() {
            int target = randomNumberGenerator.getNumber();
            boolean gameRunning = true;
            while (gameRunning) {
                int number = userInput.getUserNumber();
                if (number == target) {
                    userOutput.writeMessage("Gagné !");
                    gameRunning = false;
                } else if (target < number) {
                    userOutput.writeMessage("Le nombre est plus petit");
                } else {
                    userOutput.writeMessage("Le nombre est plus grand");
                }
            }
        }
    }

    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        UserInput userInput = new UserInput();
        UserOutput userOutput = new UserOutput();
        GameLoop gameLoop = new GameLoop(rng, userInput, userOutput);
        gameLoop.loopForever();
    }
}
