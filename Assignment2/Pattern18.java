public class Pattern18{
  public static void main(String[] args) {
    int size = 5;
    int alpha = 65;

    for (int i = 0; i < size; i++) {
      
      for (int j = 0; j < size - i; j++) {
        System.out.print((char)(alpha+j));
      }
      System.out.println();
    }
  }
}