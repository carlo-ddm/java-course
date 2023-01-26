package wb52;

import java.util.Scanner;

public class Detention {
  public static void main(String[] args) {
    System.out.println("\nHi Bart. I can write lines for you.\nWhat d yiu want me to write?");
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();
    for (int i = 1; i <= 99; i++) {
      System.out.println("\n\t" + i + ": " + line);
    }
    scan.close();
  }
}
