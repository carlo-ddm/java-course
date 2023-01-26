package wb53;

import java.util.Scanner;

public class CountingTool {
  public static void main(String[] args) {
    System.out.print("Hi Timmy! Choose a number to count to: ");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    for (int i = 0; i <= number; i++) {
      System.out.print(i + " ");
    }
    scan.close();
  }
}
