import java.util.Scanner;

public class p63 {
  public static void reverseSentence(String sentence) {
    if (sentence.isEmpty()) {
      return;
    }
    int index = sentence.indexOf(" ");
    if (index == -1) {
      System.out.print(sentence + " ");
      return;
    }
    String word = sentence.substring(0, index);
    reverseSentence(sentence.substring(index + 1));
    System.out.print(word + " ");
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String sentence = sc.nextLine();
    reverseSentence(sentence);
    System.out.println();
  }
}
