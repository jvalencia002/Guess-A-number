/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumberguesser;

/**
 *
 * @author Joeyvalencia
 */
import javax.swing.JOptionPane;

import java.util.Random;

public class RandomNumberGuesser{

public static void main(String[] args) {


    Random random = new Random();
    int attempts = 0; // Number of attempts

    int randomNumber = random.nextInt(100);
    System.out.println(randomNumber);

    // This outside the loop so is showed just ONE time
    JOptionPane.showInputDialog(null,
                    "Guess a number between 1 and 10.\nNumber Guesser \nPlease enter your name."
                        ,JOptionPane.QUESTION_MESSAGE);

    while (true && attempts < 10) {

        attempts++;



        String guess = JOptionPane.showInputDialog(null, "Guess a number.",
                "Guess", JOptionPane.QUESTION_MESSAGE);
        if (guess == null) {
            System.out.println("The user has terminated the program");
            System.exit(0);
        }
        int guess1 = Integer.parseInt(guess);

            if (guess1 > 10 || guess1 < 0)
                JOptionPane
                        .showMessageDialog(
                                null,
                                "Guess is out of range!\nPlease enter valid input.",
                                "Invalid Input",
                                JOptionPane.WARNING_MESSAGE);

            else if (randomNumber > guess1)
                JOptionPane.showMessageDialog(null,
                        "You guessed too low.\nGuess again!", "Your guess",
                        JOptionPane.INFORMATION_MESSAGE);

            else if (randomNumber < guess1)
                JOptionPane.showMessageDialog(null,
                        "You guessed too high.\nGuess again!",
                        "Your guess", JOptionPane.INFORMATION_MESSAGE);

            else {
                JOptionPane
                        .showMessageDialog(null,
                                "You guessed the number right!\nIt took you "
                                        + attempts + " attempt(s) to guess it.",
                                "Congratulations!",
                                JOptionPane.INFORMATION_MESSAGE);
                if (JOptionPane.showConfirmDialog(null,
                        "Want to play again?", "Play again?",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                    System.out.println("Play again soon!");
                    System.exit(0);
                } else {
                    randomNumber = random.nextInt(100);
                    System.out.println(randomNumber);
                    attempts = 0;
                }
            }




        }
        }   


        }
