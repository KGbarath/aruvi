public class p24 {
    public static void main(String[] args) {
      int y = 10;
      int z;
      
      z = (++y * (y++ + 5));
      System.out.println("z = (++y * (y++ + 5)): " + z); // Output: z = (++y * (y++ + 5)): 165
    }
  }
  
