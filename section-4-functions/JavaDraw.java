import java.util.Scanner;

public class JavaDraw {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int choice;
    printOptions();
    
    choice = scan.nextInt();
    while(choice == 0 || choice > 4){
      System.out.println("\nScelta non valida");
      printOptions();
      choice = scan.nextInt();
    }
    printDraw(choice);
  }

  /**
   * Name: printOptions
   * 
   * Explanation: stampa le opzioni disponibili
   */
  public static void printOptions(){
    System.out.print("\nQuale animale ti piacerebbe disegnare?\n");
    System.out.println("Scrivi 1 per disegnare una farfalla");
    System.out.println("Scrivi 2 per disegnare una elefante");
    System.out.println("Scrivi 3 per disegnare un orso");
    System.out.println("Scrivi 4 per disegnar un serpente");
  }

  /**
   * Name: printDraw
   * @param choice (int)
   * Explanation: stampa il disegno di un animale in base alla scelta effettuata
   */
  public static void printDraw(int choice) {
    switch (choice) {
      case 1: drawButterfly();
        break;
      case 2: drawElephant();
        break;
      case 3: drawBear();
        break;
      case 4: drawSnake();
        break;
      default: break;
    } 
  }

  /**
   * Name: drawButterfly
   * 
   * Explanation: disegna una farfalla
   */
  public static void drawButterfly() {
    System.out.println("  .==-.                   .-==.     ");
    System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
    System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
    System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
    System.out.println("      `._... .q(_)p. ..._.'         ");
    System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
    System.out.println("        .\"\"' .'|=|`. `\"\".       ");
    System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
    System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
    System.out.println("      \\O `::/       \\::' O/       ");
    System.out.println("       \"\"--'         `--\"\"      ");
  }

  /**
   * Name: drawElephant
   * 
   * Explanation: disegna un elefante
   */
  public static void drawElephant() {
    System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
    System.out.println("   _.-'         \\ __...----...__ /         '-._");
    System.out.println(" .'      .:::...,'              ',...:::.      '.");
    System.out.println("(     .'``'''::;                  ;::'''``'.     )");
    System.out.println(" \\             '-)              (-'             /");
    System.out.println("  \\             /                \\             /");
    System.out.println("   \\          .'.-.            .-.'.          /");
    System.out.println("    \\         | \\0|            |0/ |         /");
    System.out.println("    |          \\  |   .-==-.   |  /          |");
    System.out.println("     \\          `/`;          ;`\\`          /");
    System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
    System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
    System.out.println("               / /`;   .==.   ;`\\ \\");
    System.out.println("         .---./_/   \\  .==.  /   \\ \\");
    System.out.println("        / '.    `-.__)       |    `\"");
    System.out.println("       | =(`-.        '==.   ;");
    System.out.println("        \\  '. `-.           /");
    System.out.println("         \\_:_)   `\"--.....-'");
  }

  /**
   * Name: drawBear
   * 
   * Explanation: disegna un orso
   */
  public static void drawBear() {
    System.out.println("            ___   .--. ");
    System.out.println("      .--.-\"   \"-' .- |");
    System.out.println("     / .-,`          .'");
    System.out.println("     \\   `           \\");
    System.out.println("      '.            ! \\");
    System.out.println("        |     !  .--.  |");
    System.out.println("        \\        '--'  /.____");
    System.out.println("       /`-.     \\__,'.'      `\\");
    System.out.println("    __/   \\`-.____.-' `\\      /");
    System.out.println("    | `---`'-'._/-`     \\----'    _");
    System.out.println("    |,-'`  /             |    _.-' `\\");
    System.out.println("   .'     /              |--'`     / |");
    System.out.println("  /      /\\              `         | |");
    System.out.println("  |   .\\/  \\      .--. __          \\ |");
    System.out.println("   '-'      '._       /  `\\         /");
    System.out.println("               `\\    '     |------'`");
    System.out.println("                 \\  |      |");
    System.out.println("                  \\        /");
    System.out.println("                   '._  _.'");
    System.out.println("                      ``");
  }
  /**
   * Name: drawSnake
   * 
   * Explanation: disegna un serpente
   */
  public static void drawSnake() {
    System.out.println("         ,,'6''-,.");
    System.out.println("        <====,.;;--.");
    System.out.println("        _`---===. \"\"\"==__");
    System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
    System.out.println("     |( @@@  |===|  @@@  ||");
    System.out.println("      \\\\ @@   |===|  @@  //");
    System.out.println("        \\\\ @@ |===|@@@ //");
    System.out.println("         \\\\  |===|  //");
    System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
    System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
    System.out.println("             |==||                           `\\   \\");
    System.out.println("            |==| |                             )   |");
    System.out.println("           |==| |       _____         ______,--'   '");
    System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
    System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
    System.out.println("                \"\"\"\"		");
  }
}
