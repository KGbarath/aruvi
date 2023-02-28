public class p21 {
    public static void main(String[] args) {
      int a = 10, b = 5;
      
      // i) ++a - b--
      System.out.println("++a - b--: " + (++a - b--));  // Output: ++a - b--: 6
      a = 10; b = 5;
      
      // ii) a % b++
      System.out.println("a % b++: " + (a % b++)); // Output: a % b++: 0
      a = 10; b = 5;
      
      // iii) a *= b + 5
      a *= b + 5;
      System.out.println("a *= b + 5: " + a); // Output: a *= b + 5: 60
      a = 10; b = 5;
      
      // iv) x = 69 >>> 2
      int x = 69 >>> 2;
      System.out.println("x = 69 >>> 2: " + x); // Output: x = 69 >>> 2: 17
    }
  }
  
