import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {

    public static void findDuplicateCharacters(String str) {
        Set<Character> duplicateChars = new HashSet<>();
        Set<Character> seenChars = new HashSet<>();
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (!seenChars.add(ch)) {
                duplicateChars.add(ch);
            }
        }
        System.out.println("Duplicate characters are :");
        for (char ch : duplicateChars) {
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        String input = "java";
        findDuplicateCharacters(input);
    }
}
