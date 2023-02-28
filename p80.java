public class p80 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The largest number is: " + max);
    }
}

