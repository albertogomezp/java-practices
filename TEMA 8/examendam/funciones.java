package examendam;
public class funciones{  
  /**
  * Para imprimir arrays, para uso generico, modifcar el print
  * @param ArPrint
  */
  public static void PrintArray(String[] ArPrint) {  
    for (int cont = 0; cont < ArPrint.length; cont++){
      System.out.println(ArPrint[cont]);
    }
  }
  /**
  * Para calcular el ancho
  * @param height
  * @return devuelve el ancho
  */
  public static int CalcAncho(int height) {  
    int ancho = 3;
    for(int base = 4; base <=height-1; base++){
      ancho += 2;
    }
    return ancho;
  }
}  




