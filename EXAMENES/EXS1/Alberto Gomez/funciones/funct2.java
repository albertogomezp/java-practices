package funciones;
/** 
 * El segundo ejercicio 
 * @author Alberto Gomez Peña - 1ºDAW
 */
public class programa{
  int[] vector = generarVector();

  
  
  /**
  * Genera el vector y lo rellena
  * @return el vector relleno
  */
  public static int[] generarVector(){
    System.out.println("Indique el tamano del vector: ");
    int[] vector = new int[Integer.parseInt(System.console().readLine())];
    System.out.println("Numeros del vector:");
    for(int x = 0; x <= vector.length; x++){
      vector[x] =(int)Math.random*1000;
      System.out.print(vector[x]+" ");
    }
    return vector;
  }
  /**
   * Reordena el vector 
   * @param vector
   * @return
   */
  public static int[] reordenarVector(int[] vector){
    String Numero = " ";
    int contador = 0;
    int intercambio = 0;
    for(int x = 0; x <= vector.length; x++){
      Numero = " ";
      Numero = integer.toString(vector[x]);
      if(Numero.contains("7") == true && contador <= vector.length){
        intercambio = vector[contador];
        vector[contador] = vector[x];
        vector[x] = intercambio;
        contador++;
      }
    }  
    return vector;
  }
  
}