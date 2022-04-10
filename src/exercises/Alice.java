package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wordToSearch;
        int intIndex;
        String bookQuote = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        bookQuote = bookQuote.toLowerCase();

        System.out.println("Search for a word from the Alice except:");
        wordToSearch = input.nextLine();

        intIndex = bookQuote.indexOf(wordToSearch.toLowerCase());

        if(intIndex == - 1) {
            System.out.println("Word not found");
        } else {
            System.out.println("Found at index " + intIndex);
        }
    }
}

