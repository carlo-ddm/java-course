import java.util.Scanner;
import javax.lang.model.element.Element;

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\nLet's play Rock Paper Scissors.\nWhen I say 'shoot', Choose: rock, paper, or scissors.\nAre you ready? Write 'yes' if you are");
    String choice = scan.nextLine();
    setUpGame(isYes(choice));
  }

  /**
   * Name: isYes
   * @param choice (string)
   * Explanation: la funzione controlla se la risposta dell'utente corrisponde alla stringa
   * @return (boolean)
   */
  public static boolean isYes(String choice) {
    return (choice.equals("Yes") || choice.equals("yes"));
  }

  /**
   * Name: setUpGame
   * @param isYes (boolean)
   * Explanation: la funzione registra la scelta dell'utente , la scelta randomica del computer e il risultato. La funzione stampa il risultato
   */
  public static void setUpGame(boolean isYes){
    if (isYes) {
      System.out.println("\nGreat!\nrock - paper - scissors, shoot!");
      
      Scanner scan = new Scanner(System.in);

      String choice = scan.nextLine();
      String computerChoice = computerChoice();
      String result = result(choice, computerChoice);

      print(choice, computerChoice, result);
      scan.close();
    } else {
      System.out.println("\nDarn, some﻿ other time...!");
      System.exit(0);
    }
  }

  /**
   * Name: computeChoice
   * Explanation: la funzione assegna una stringa ad ognuno dei dei singoli valori (0 - 1 - 2) estratti randomicamente dal metodo random
   * @return (string)
   */
  public static String computerChoice(){
    double randomNumer = Math.random() * 3;
    int choice = (int)randomNumer;
    if (choice == 0) {
      return "rock";
    } else if (choice == 1){
      return "paper";
    } else {
      return "scissors";
    }
  }

  /**
   * Name: result
   * @param yourChoice
   * @param computerChoice
   * 
   * Explanation: la funzione confronta la scelta dell'utente con la stringa estratta dal sistema. In base al confronto restituisce uno dei tre possibili risultati
   * 
   * NB. default => "INVALID CHOICE"
   * @return (string)
   */
  public static String result(String yourChoice, String computerChoice) {
    String result;
    switch (yourChoice) {
      case "rock":
      if (computerChoice.equals("scissors")) {
        result = "\nYou win";
      } else if(computerChoice.equals("paper")) {
        result = "\nYou lose";
      } else {
        result = "\nIt's a tie";
      }
        break;
        
      case "paper":
      if (computerChoice.equals("rock")) {
        result = "\nYou win";
      } else if(computerChoice.equals("scissors")) {
        result = "\nYou lose";
      } else {
        result = "\nIt's a tie";
      }
        break;

      case "scissors":
      if (computerChoice.equals("paper")) {
        result = "\nYou win";
      } else if(computerChoice.equals("rock")) {
        result = "\nYou lose";
      } else {
        result = "\nIt's a tie";
      }
        break;

      default:
        result = "\nInvalid choice";
        break;
    }
    return result;
  }

  /**
   * Name: print
   * @param choice
   * @param computerChoice
   * @param result
   * Explanation: stampa le singole scelte e il risultato della comparazione
   */
  public static void print(String choice, String computerChoice, String result) {
    System.out.println("\nYour choice: " + choice + ".\nComputer choice: " + computerChoice + ".");
    System.out.println(result);
  }
}
