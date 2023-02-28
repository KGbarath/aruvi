public class p59 {
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
 
    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println("GCD of " + a + " and " + b + " is: " + findGCD(a, b));
    }
}

