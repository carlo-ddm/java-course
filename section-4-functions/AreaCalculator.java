public class AreaCalculator {
  public static void main(String[] args) {
    System.out.println("Thank you for using the area calculator");
    System.out.println("This calculator lets you get the area of: ");
    System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

    print();
  }

  /**
   * Name: areaSquare
   * @param side (double)
   * @return area di un quadrato (double)
   * 
   * else: interrompe il sistema
   */
  public static double areaSquare(double side) {
    double result = 0;
    if (side > 0) {
      result = Math.pow(side, 2);
    } else {
      System.out.println("Error: impossible");
      System.exit(0);
    }
    return result;
  }

  /**
   * Name: areaRectangle
   * @param width (double)
   * @param height (double)
   * @return area di un rettangolo (double)
   * 
   * else: interrompe il sistema
   */
  public static double areaRectangle(double width, double height){
    double result = 0;
    if (width > 0 && height > 0) {
      result = width * height;
    } else {
      System.out.println("Error: impossible");
      System.exit(0);
    }
    return result;
  }

  /**
   * Name: areaTriangle
   * @param base (double)
   * @param height (double)
   * @return area di un triangolo (double)
   * 
   * else: interrompe il sistema
   */
  public static double areaTriangle(double base, double height){
    double result = 0;
    if (base > 0 && height > 0) {
      result = (base * height) / 2;
    } else {
      System.out.println("Error: impossible");
      System.exit(0);
    }
    return result;
  }

  /**
   * Name areaCircle
   * @param radius (double)
   * NOTE: PI GRECO => 3.14 (PI)
   * @return area di un cerchio (double)
   * 
   * else: interrompe il sistema
   */
  public static double areaCircle(double radius){
    double result = 0;
    if (radius > 0) {
      result = Math.PI * Math.pow(radius, 2);
    } else {
      System.out.println("Error: impossible");
      System.exit(0);
    }
    return result;
  }

  /**
   * Name: print
   * Explanation: stampa le aree delle forme geometriche considerate
   */
  public static void print(){
    // Square
    double areaSq = areaSquare(4);
    System.out.println("L'area del quadrato misura " + areaSq);
    // Rectangle
    double areaRe = areaRectangle(4, 5);
    System.out.println("L'area del rettangolo misura " + areaRe);
    // Triangle
    double areaTr = areaTriangle(4, 5);
    System.out.println("L'area del triangolo misura " + areaTr);
    // Circle
    double areaCi = areaCircle(4);
    System.out.println("L'area del cerchio misura " + areaCi);
  }
}
