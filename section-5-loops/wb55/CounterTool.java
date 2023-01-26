package wb55;

import java.util.Scanner;

public class CounterTool {
  public static void main(String[] args) {
    System.out.println("\n\tI hear you like count by trees");
    System.out.println("\tJimmy: it depends.");
    System.out.println("\tOh, ok...");

    Scanner scan = new Scanner(System.in);
    int by = 0;
    int from = 0;
    int to = 0;

    for (int i = 1; i <= 3; i++) {
      int data = getDatas(i, scan);
      if (i == 1) {
        by = data;
      } else if (i == 2) {
        from = data;
      } else {
        to = data;
      }
    }

    for (int i = from; i <= to; i+=by) {
      System.out.print(i + " ");
    }

    scan.close();
  }

  public static int getDatas(int iteration, Scanner scan){
    int data = 0;
    switch (iteration) {
      case 1: 
      System.out.println("Pick a number to count by");
      data = scan.nextInt();
        break;

      case 2:
      System.out.println("Pick a number to start counting from");
      data = scan.nextInt();
        break;

      case 3:
      System.out.println("Pick a number to count to");
      data = scan.nextInt();
        break;
      default:
      System.out.println("");
        break;
    }
    return data;
  }

  
}
