package piglatin;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<String> text = new ArrayList<String>();

    Book() {
        // Empty book - no code needed here.
    }

    // Helper to debug code
    // Prints out a range of lines from a book
    public void printlines(int start, int length) {
        System.out.println("Lines " + start + " to " + (start + length) + " of book: " + title);
        for (int i = start; i < start + length; i++) {
            if (i < text.size()) {
                System.out.println(i + ": " + text.get(i));
            } else {
                System.out.println(i + ": line not in book.");
            }
        }
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getLine(int lineNumber) {
        return text.get(lineNumber);
    }

    int getLineCount() {
        return text.size();
    }

    void appendLine(String line) {
        text.add(line);
    }

    public void readFromString(String title, String string) {
        // load a book from an input string.
        this.title = title;

        // TODO: use Scanner to populate the book
        // use: text.add(line) to add a line to the book.
        Scanner sc = new Scanner(string);
        while (sc.hasNextLine()) {
            text.add(sc.nextLine());
        }
        sc.close();
    }

    public void readFromUrl(String title, String url) {
        // load a book from a URL.
        this.title = title;

        try {
            URL bookUrl = URI.create(url).toURL();
            Scanner sc = new Scanner(bookUrl.openStream());
            while (sc.hasNextLine()) {
                text.add(sc.nextLine());
            }
            sc.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    void writeToFile(String name) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(name));
            for (String line : text) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
