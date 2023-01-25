public class DocComments {
  public static void main(String[] args) {
    
  }
  /**
   * Name:  greet
   * 
   * Explanation:
   * 1. Stampa: "Ciao"
   */
  public static void greet() {
    System.out.println("Ciao");
  }

  /**
   * Name: printText
   * @param name (string)
   * @param age (string)
   * 
   * Explanation:
   * 1. Stampa nome ed età
   */
  public static void printText(String name, String age){
    System.out.println("Ciao, mi chiamo " + name + " ed ho " + age + " anni.");
  }

  /**
   * Name: calculateArea
   * @param length (double)
   * @param width (double)
   * @return      (double)
   * 
   * Explanation:
   * 1. Calcola l'area
   */
  public static double calculateArea(double length, double width) {
    double area = length * width;
    return area;
  }
}
