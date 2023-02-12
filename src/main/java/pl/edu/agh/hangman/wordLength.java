package pl.edu.agh.hangman;

import java.util.Scanner;

public class wordLength {

    public void WordLength(String word) {

        char[] numberOfLetterHidden;
        char[] numberOfLetter;

        String randomWord = word;
        numberOfLetterHidden = new char[word.length()];
        numberOfLetter = new char[word.length()];

        for (int i = 0; i < randomWord.length(); i++) {
            numberOfLetterHidden[i] = '_';
            numberOfLetter[i] = word.charAt(i);


            System.out.println("Select letter: ");
            Scanner scanner = new Scanner(System.in);
            char letter = scanner.next().charAt(0);

            for (int j = 0; j < numberOfLetter.length; j++) {
                if (letter == numberOfLetter[i]) {
                    numberOfLetterHidden[i] = letter;
                }
            }


        }
        System.out.println(numberOfLetterHidden);

    }

}

