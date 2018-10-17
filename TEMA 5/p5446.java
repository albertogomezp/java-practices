public class p5446 { 
  public static void main(String[] args){
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.print(" POR FAVOR, INSERTE LA ALTURA:  ");         //INTRODUCE EL NUMERO
    int alt = Integer.parseInt(System.console().readLine()); //CONOCEREMOS LA ALTURA
    System.out.print(" POR FAVOR, INSERTE EL ANCHO:  ");         //INTRODUCE EL NUMERO
    int ancho = Integer.parseInt(System.console().readLine()); //CONOCEREMOS EL ANCHO
    int esp = ancho+ancho;
    String espacio ="";
    if(alt>=2 && ancho>=2){
      for(int cont2 = 1; cont2<=ancho; cont2++){ //PRINT DE LA PARTE SUPERIOR
        System.out.print("* ");
      } 
      System.out.println("");
      for(int cont = 3 ; cont < (esp-2) ; cont++){ //CALCULO DE LA DISTANCIA ENTRE AMBAS COLUMNAS
          espacio = espacio.concat(" "); //
      }
      for(int cont = 1; cont<(alt-1);cont++){ //PRINT DE LOS LADOS
        System.out.println("* "+espacio+" *");
      }
      //System.out.print(" ");
      for(int cont2 = 1; cont2<=ancho; cont2++){ //PRINT DE LA BASE
        System.out.print("* ");
      }
    }
    else{
      System.out.println("ERROR");
    }        
  }      
}
