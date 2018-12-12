package paquetes;
public class funciones{  
  /**
  * Para imprimir el tablero
  * @param Tablero
  */
  public static void PrintTablero(String[][] Tablero) {  
    for(int x=0; x < 3 ;x++){
      for(int y=0;  y < 3;y++){
        System.out.print("["+Tablero[x][y]+"]");
      }
      System.out.println("");
    }
    System.out.println("Se recuerda que X es el eje x comenzando en 0 \nSe recuerda que el  Y es el eje Y invertido empezando en 0 ");
  }
  /**
  * 
  * @param cont  contador de busqueda de numero
  * @param sumador suma los divisores
  * @param divis contador
  * @param tope tope
  * @return suma de los divisores
  */
  public static long ObtenerDivisoresYsuma(long cont,long sumador,int divis,int tope) {
    for(long check = 1; check<cont;check++){
      if(cont%check ==0){
        //System.out.println("divis "+divis+" check"+check);
        sumador += check;
        if(divis<tope-1){
          divis++;
        }
      }
    }
    return sumador;
  } 
  /**
   * 
   * @param sumador la suma de los numeros
   * @param cont el numero por el que vamos comprobando
   * @return devuelve el sumador reseteado
   */
  public static long comprobarYreset(long sumador,long cont) {
    //System.out.println(cont);
    if(sumador ==cont){
      System.out.println("El numero "+cont+" ES PERFECTO (o eso dicen...)");
    }
    sumador =0; 
    return sumador; 
  }  
}

