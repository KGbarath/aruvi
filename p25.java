public class p25 {
    public static void main(String[] args) {
      int x = 5;
      int x1;
      
      x1 = ++x - x++ + -x;
      System.out.println("x1 = ++x - x++ + -x: " + x1); // Output: x1 = ++x - x++ + -x: 1
    }
  }
  
