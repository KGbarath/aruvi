public class p19 {
    public static void main(String[] args) {
      int num = 17; // number to count set bits in
      int count = 0;
      
      while (num > 0) {
        count += num & 1;
        num = num >> 1;
      }
      
      System.out.println("Number of set bits in the given number: " + count);
    }
  }
  