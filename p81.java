public class p81 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("The smallest number is: " + min);
    }
}

