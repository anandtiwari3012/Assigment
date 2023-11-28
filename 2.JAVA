import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a Roman numeral
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        // Convert the Roman numeral to an integer
        int result = romanToInt(romanNumeral);

        // Display the result
        System.out.println("Integer representation: " + result);

        scanner.close();
    }

    public static int romanToInt(String s) {
        // Define a map to store the values of Roman numerals
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        // Iterate through the Roman numeral string
        for (int i = 0; i < s.length(); i++) {
            // Get the integer value of the current Roman numeral
            int currentInt = romanMap.get(s.charAt(i));

            // If the next Roman numeral is larger, subtract the current value
            if (i < s.length() - 1 && romanMap.get(s.charAt(i + 1)) > currentInt) {
                result -= currentInt;
            } else {
                result += currentInt;
            }
        }

        return result;
    }
}
