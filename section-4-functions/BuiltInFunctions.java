public class BuiltInFunctions {
  public static void main(String[] args) {
    /*
     * Per quale motivo dobbiamo scvere System.out prima di chiamare la funzione println (all'interno della quale passiamo un argomento, cioè una stringa)?
     * Perchè la funzione prinln si trova all'interno di un'altra classe
     */


     /*
      * FUNZIONI MATEMATICHE (che fanno parte della classe Math fornita da java)
      * NB. Sono tipologie di funzioni che si aspettano un parametro di tipo double e che restituiscono un valore dello stesso tipo
      * 1. LOG -> logaritmo naturale 
      * 2. SIN -> seno
      * 3. COS -> coseno
      * 4. POW -> potenza // in questo caso la funzione si aspetta più parametri (la base e l'esponente)
      */
      
      System.out.println(Math.log(119.6));
      System.out.println(Math.sin(1.2));
      System.out.println(Math.cos(1.2));
      System.out.println(Math.pow(2, 3));

  }
}
