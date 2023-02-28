public class p22 {
    public static void main(String[] args) {
      int a = 28;
      
      a += a++ + ++a + -a + a--;
      System.out.println("a += a++ + ++a + -a + a--: " + a); // Output: a += a++ + ++a + -a + a--: 41
    }
  }
  
