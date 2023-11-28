import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Check if the sentence is a pangram
        boolean isPangram = isPangram(sentence.toLowerCase());

        // Display the result
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String sentence) {
        // Create a set to store unique lowercase letters in the sentence
        Set<Character> letterSet = new HashSet<>();

        // Iterate through each character in the sentence
        for (char c : sentence.toCharArray()) {
            // Check if the character is a lowercase letter
            if (Character.isLetter(c)) {
                letterSet.add(c);
            }
        }

        // Check if the set size is equal to the number of lowercase letters in the alphabet
        return letterSet.size() == 26;
    }
}
