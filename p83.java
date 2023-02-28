import java.util.Arrays;

public class p83 {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        System.out.println("The destination array is: " + Arrays.toString(destination));
    }
}

