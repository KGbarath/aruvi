public class p23 {
    public static void main(String[] args) {
      int x = 10;
      
      x = x++ * 2 + 3 * -x;
      System.out.println("x = x++ * 2 + 3 * -x: " + x); // Output: x = x++ * 2 + 3 * -x: -73
    }
  }
  
