import java.util.Scanner;
public class p56 {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it can be expressed as sum of two prime numbers:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
 
        if (isPrimeNumberSum(num)) {
            System.out.println("Yes, The number " + num + " can be expressed as sum of two prime numbers.");
        } else {
            System.out.println("No, The number " + num + " cannot be expressed as sum of two prime numbers.");
        }
    }
 
    public static boolean isPrimeNumberSum(int num) {
        int i = 0;
        int j = 0;
 
        // check every possible combination of two prime numbers
        // until the sum of two prime numbers is equal to the given number
        for (i = 2; i <= num; i++) {
            for (j = 2; j <= num; j++) {
                if (isPrime(i) && isPrime(j) && (i + j == num)) {
                    return true;
                }
            }
        }
        return false;
    }
 
    public static boolean isPrime(int n) {
        // check if n is a multiple of 2
        if (n % 2 == 0) {
            return false;
        }
 
        // if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

