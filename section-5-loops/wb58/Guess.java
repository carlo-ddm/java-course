package wb58;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Guess {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("The system has extracted a number between 1 and 5.\nTry to guess it!");
    int extracted = extractor();
    int choice = choice(extracted, scan);
    int attempts = attempts(extracted, choice, scan);
    String result = result(extracted, choice, attempts);
    System.out.println(result);
    scan.close();
  }

  /**
   * Name: extractor
   * Explanation: estrazione di un numero (double) che viene convertito intero
   * @return (int)
   */
  public static int extractor(){
    double extracted = Math.random() * 6;
    int integer = (int) extracted;
    return integer;
  }

  /**
   * Name: choice
   * @param extracted (int)
   * @param scan (Scanner)
   * Explanation: richiesta di selezione e controllo sulla selezione
   * @return choice (int)
   */
  public static int choice(int extracted, Scanner scan){
    int choice = scan.nextInt();

    while (choice < 0 || choice > 5) {
      System.out.println("Invalid choice.\nTry to guess it!");
      choice = scan.nextInt();
    }
    
    return choice;
  }

  /**
   * Name: attempts
   * @param extracted (int)
   * @param choice (int)
   * Explanation: conteggio del numero di tentativi
   * @return counter (int)
   */
  public static int attempts(int extracted, int choice, Scanner scan){
    int counter = 0;
    while(extracted != choice){
      counter++;
      choice = choice(extracted, scan);
      System.out.println("Try again!");
    }
    return counter;
  }

  /**
   * 
   * @param extracted
   * @param choice
   * @param attempts
   * @return
   */
  public static String result(int extracted, int choice, int attempts){
    String result = "";
    if (extracted == choice) {
      result = "You win!\nAttempts: " + attempts;
    }
    return result;
  }
}
