public class p69 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
