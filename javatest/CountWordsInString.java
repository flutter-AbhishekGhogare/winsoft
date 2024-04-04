import java.util.HashMap;

public class CountWordsInString {

    public static void main(String[] args) {
        String input = "Example string";

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        String[] words = input.split("\\s+");

        for (String word : words) {
            Integer count = wordCountMap.get(word);
            if (count == null) {
                count = 0;
            }
            wordCountMap.put(word, count + 1);
        }

        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}