public class MaximumArray {
    public static int findMaximum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) max = number;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 50, 20, 40, 30};
        System.out.println("Maximum element = " + findMaximum(numbers));
    }
}
