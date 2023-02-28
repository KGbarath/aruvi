import java.util.HashMap;

public class p84 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }
        System.out.println("The frequency of each element in the array is: " + frequencyMap);
    }
}

