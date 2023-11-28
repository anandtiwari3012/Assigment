import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array with values (1, 2, 3, 4, 5, 6, 7)
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        shuffleArray(array);

        // Print the shuffled array
        System.out.print("Shuffled array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    // Fisher-Yates shuffle algorithm
    static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = random.nextInt(i + 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
