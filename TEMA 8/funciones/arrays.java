package funciones;
public class arrays{  
  /**
  * Crea un array y lo rellena con valores aleatorios dentro de un rango.
  * <p>
  * Por ejemplo, <code>generaArrayInt(100, 10, 30)</code> devolvería un array
  * de 100 números generados al azar comprendidos entre 10 y 30.
  * 
  * @param size      número de elementos que contendrá el array
  * @param MinNum límite inferior del intervalo de números aleatorios
  * @param MaxNum límite superior del intervalo de números aleatorios
  * @return       array relleno con valores aleatorios dentro del rango
  *               definido por <code>minimo</code> y <code>maximo</code>
  */
	public static int[] generaArrayInt(int size,int MinNum, int MaxNum) {
    int[] ArAns =  new int[size];  
    for (int cont = 0; cont < ArAns.length; cont++){
      ArAns[cont] =  (int)(Math.random()*(MaxNum-MinNum)+MinNum);
    }
    return ArAns;
  } 
  /**
  *  Devuelve el mínimo del array que se pasa como parámetro.
  * 
  * @param Ar     Array
  * @return      Devuelve el menor numero encontrado en <code>Ar[]</code>
  */
	public static int minimoArrayInt(int[] Ar) {
    int MinNumber = 1000;
    // ---> Asking for numbers and comparing 
    for( int Search = 0; Search <Ar.length; Search++){
      if (Ar[Search] < MinNumber){ // ---> In case this number is the Minimun (relative)
        MinNumber = Ar[Search];
      }
    }
    return MinNumber;
  } 
    /**
  *  Devuelve el maximo del array que se pasa como parámetro.
  * 
  * @param Ar     Array
  * @return      Devuelve el mayor numero encontrado en <code>Ar[]</code>
  */
  public static int maximoArrayInt(int[] Ar) {
    int MaxNumber = 0;
    // ---> Asking for numbers and comparing 
    for( int Search = 0; Search <Ar.length; Search++){
      if (Ar[Search] > MaxNumber){ // ---> In case this number is the Maximun (relative)
        MaxNumber = Ar[Search];
       
      }
    }
    return MaxNumber;
  } 
  
  
  
  /**
  * Para imprimir arrays
  * @param ArPrint
  */
  public static void PrintArray(int[] ArPrint) {  
    for (int cont = 0; cont < ArPrint.length; cont++){
      System.out.print("Ar["+cont+"] = "+ArPrint[cont]+" ");
    }
  }
}  