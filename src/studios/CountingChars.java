package studios;
import java.util.HashMap;
import java.util.Map;


public class CountingChars {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCounting = new HashMap<>();
        String sent = "Counting the characters in this.###$$#%#%#%";
        String[] stringArray = sent.split("\\W+");
        String resultNonAlph = new String();
        for(int i = 0; i < stringArray.length;i++){
            resultNonAlph = resultNonAlph + stringArray[i];
        }
       // char charactersInString = new char[resultNonAlph.length];

        char[] charactersInString = resultNonAlph.toLowerCase().toCharArray();
        for(int i = 0; i < charactersInString.length; i++){
            if(!charCounting.containsKey(charactersInString[i])) {
                charCounting.put(charactersInString[i], 1);
            }
                else {
                    charCounting.put(charactersInString[i], charCounting.get(charactersInString[i]).intValue() + 1);
                }
            }

        for(Character key: charCounting.keySet()){
            System.out.println(key + ": " + charCounting.get(key));
        }
    }
}

