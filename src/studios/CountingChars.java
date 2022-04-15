package studios;
import java.util.HashMap;
import java.util.Map;


public class CountingChars {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCounting = new HashMap<>();
        String sent = "Counting the characters in this.";
        char[] charactersInString = sent.toLowerCase().toCharArray();
        for(int i = 0; i < charactersInString.length; i++){
            if(!charCounting.containsKey(charactersInString[i])) {
                charCounting.put(charactersInString[i], 1);
            }
                else {
                    charCounting.put(charactersInString[i], charCounting.get(charactersInString[i]).intValue() + 1);
                }
            }
        System.out.println(charCounting);
        for(Character key: charCounting.keySet()){
            System.out.println(key + ": " + charCounting.get(key));
        }
    }
}

