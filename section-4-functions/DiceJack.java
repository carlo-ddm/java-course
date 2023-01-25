import java.util.Scanner;

public class DiceJack {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int firstRoll = rollDice();
    int secondRoll = rollDice();
    int thirdRoll = rollDice();

    System.out.println("\n\tInserisci tre numeri tra 1 e 6");
    int firstNum = scan.nextInt();
    int secondNum = scan.nextInt();
    int thirdNum = scan.nextInt();

    if (firstNum < 1 || secondNum < 1 || thirdNum < 1) {
      System.out.println("\n\tI numeri non possono essere inferiori a 1");
      System.exit(0);
    }

    if (firstNum > 6 || secondNum > 6 || thirdNum > 6) {
      System.out.println("\n\tI numeri non possono essere superiori a 6");
      System.exit(0);
    }

    int sumOfNumbers = firstNum + secondNum + thirdNum;
    int sumDiceRolls = firstRoll + secondRoll + thirdRoll;
    System.out.println("\n\tLa somma dei tiri equivale a:\n" + sumDiceRolls + "\n\tLa somma dei valori estratti equivale a:\n" + sumOfNumbers);
    
    if (checkWin(sumDiceRolls, sumOfNumbers)) {
      System.out.println("Hai vinto");
    } else {
      System.out.println("Hai perso");
    }
    scan.close();
  }
  
  /**
   * Name: rollDice
   * 
   * Explanation: Math.random() resituisce un valore compreso tra 0 - 0.99999999999. Moltiplicando questo valore per il massimo valore possibile relativo al lancio di un dato (6) otterremmo la restituzione randomica di un calore compreso tra 0 - 5.999999999. Sommando 1 il valore massimo restituito è 6.9999999999, che trasformato in intero diventa 6. In questo modo avremo sempre numeri compresi tra 1 - 6
   * 
   * @return (int)
   */
  public static int rollDice(){
    double randomNumber = (Math.random() * 6) + 1;
    return (int)randomNumber;
  }

  /**
   * Name: checkWin
   * @param sumDiceRolls
   * @param sumOfNumbers
   * @return (boolean)
   */
  public static boolean checkWin(int sumDiceRolls, int sumOfNumbers) {
    return (sumOfNumbers > sumDiceRolls && sumOfNumbers - sumDiceRolls < 3);
  }
}
