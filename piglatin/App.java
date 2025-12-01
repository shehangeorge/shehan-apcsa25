package piglatin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args)
    {
        /*  Introduction and TODO List

        This project is setup with four main classes:
            1. App - the main application
            2. Book - a class that creates the basic book objects.
                - a Book contains a representation of a real book.
                - Book has methods to read data in from various sources
                - Book also has methods to read data out.
            3. PigLatinTranslator - a static class
                - Used to implement your translator.
                - Has two public methods to take input and return a translated copy.
                    - Book translate(Book input)
                    - String translate(String input)
            4. TestSuite - a simple class that helps you test your work.
                - Just like CodingBat this class tries your code against various cases.
                - It will tell you which cases return expected output or not
         */

        // Run tests, comment out once they pass.
        int score = TestSuite.run();

        // Focus on TestSuite until you get a score of 5 or higher.
        if (score > 4)
        {
            // Starter book
            Book input = new Book();
            Book input2 = new Book();

            // Example reading from a URL
            input.readFromUrl("Romeo and Juliet", "https://www.gutenberg.org/files/1513/1513-0.txt");
            input2.readFromUrl("The Strange Case of Dr. Jekyll and Mr. Hyde", "https://www.gutenberg.org/cache/epub/43/pg43.txt");

            // Optional: preview first 5 lines
            input.printlines(0,5);
            input2.printlines(0,5);

            // Save translated book directly line by line
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("translatedbook.txt"));

                for (int i = 0; i < input.getLineCount(); i++) {
                    String line = input.getLine(i);
                    String translatedLine = PigLatinTranslator.translate(line);
                    writer.write(translatedLine);
                    writer.newLine();
                }

                writer.close();
                

            } catch (IOException e) {
                e.printStackTrace();
         
         
            }
            try {
                BufferedWriter writer2 = new BufferedWriter(new FileWriter("MYtranslatedbook.txt"));

                for (int i = 0; i < input2.getLineCount(); i++) {
                    String line = input2.getLine(i);
                    String translatedLine = PigLatinTranslator.translate(line);
                    writer2.write(translatedLine);
                    writer2.newLine();
                }

                writer2.close();
            

            } catch (IOException e) {
                e.printStackTrace();
       
        }


    }
}
}
