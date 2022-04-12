package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        int wordLength;
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);

        System.out.println(sum(numbers));

        words.add("stars");
        words.add("bug");
        words.add("frame");

        //sout reminder
        System.out.println("enter the word length for the search:");
        wordLength = input.nextInt();
        countWords(words, wordLength);

    }

    public static int sum(ArrayList<Integer> numbers ){
        int arrayListSize = numbers.size(), total = 0;
        for(int i = 0; i < arrayListSize; i++){
            total += numbers.get(i);
        }

        return total;
    }

    public static void countWords(ArrayList<String> words, int length ){
        int arrayListSize = words.size();
        for(int i = 0; i < arrayListSize; i++){
            if(words.get(i).length() == length){
                System.out.println(words.get(i));
            }
        }

    }
}
