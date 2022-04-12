package exercises;

//imported for arrays.toString
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] numArray = {1, 1, 2, 3, 5, 8};
        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        //3.7.1 explanation why \\. has to be used instead of .
        String [] quotes = quote.split("\\.");

        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i] % 2 != 0){
                System.out.println(numArray[i]);
            }
        }

        System.out.println(Arrays.toString(quotes));
    }

}


