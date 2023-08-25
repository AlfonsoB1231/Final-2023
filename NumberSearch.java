public class NumberSearch {

    public static int findNum(int numbers[], int num) {
        // Search the array for the given number
        for (int i = 0; i < numbers.length; i++) {
            // If the number is found, return its index
            if (numbers[i] == num) {
                return i;
            }
        }

        // If the number does not exist in the array, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int numToFind = 30;

        int index = findNum(numbers, numToFind);

        if (index != -1) {
            System.out.println("Number " + numToFind + " found at index: " + index);
        } else {
            System.out.println("Number " + numToFind + " not found in the array.");
        }
    }
}
