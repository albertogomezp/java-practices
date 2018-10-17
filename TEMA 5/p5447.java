public class p5447 { 
  public static void main(String[] args){
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.print(" POR FAVOR, INSERTE LA ALTURA:  ");         //INTRODUCE EL NUMERO
    int alt = Integer.parseInt(System.console().readLine()); //CONOCEREMOS LA ALTURA
    int ancho = 6;
    int esp = ancho+ancho;
    String espacio ="";
    if(alt>=5 && alt%2 !=0){
      for(int cont2 = 1; cont2<=ancho; cont2++){ //PRINT DE LA PARTE SUPERIOR
        System.out.print("M ");
      } 
      System.out.println("");
      for(int cont = 3 ; cont < (esp-2) ; cont++){ //CALCULO DE LA DISTANCIA ENTRE AMBAS COLUMNAS
          espacio = espacio.concat(" "); //
      }
      for(int cont = 1; cont<(alt-1);cont++){ //PRINT DE LOS LADOS
        System.out.println("M "+espacio+" M");
      }
      //System.out.print(" ");
      for(int cont2 = 1; cont2<=ancho; cont2++){ //PRINT DE LA DE LA LINEA DEL CENTRO
        System.out.print("M ");
      }
      espacio ="";
      System.out.println("");
      for(int cont = 3 ; cont < (esp-2) ; cont++){ //CALCULO DE LA DISTANCIA ENTRE AMBAS COLUMNAS
          espacio = espacio.concat(" "); //
      }
      for(int cont = 1; cont<(alt-1);cont++){ //PRINT DE LOS LADOS
        System.out.println("M "+espacio+" M");
      }
      //System.out.print(" ");
      for(int cont2 = 1; cont2<=ancho; cont2++){ //PRINT DE LA BASE
        System.out.print("M ");
      }
    }
    else{
      System.out.println("ERROR");
    }        
  }      
}
