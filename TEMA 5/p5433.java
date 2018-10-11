public class p5433 { 
  public static void main(String[] args){
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.print(" POR FAVOR, INSERTE UN LA ALTURA:  ");         //INTRODUCE EL NUMERO
    int alt = Integer.parseInt(System.console().readLine()); //CONOCEREMOS LA ALTURA
    int ancho = alt-2; //CON ESTO CALCULAREMOS LA DISTANCIA ENTRE LAS DOS COLUMNAS DE LA U, YA QUE ES UN CUADRADO PRACTICAMENTE
    int esp = ancho+ancho;
    String espacio ="";
      for(int cont = 1 ; cont < (esp) ; cont++){ //CALCULO DE LA DISTANCIA ENTRE AMBAS COLUMNAS
          espacio = espacio.concat(" "); //
      }
      for(int cont = 1; cont<alt;cont++){
        System.out.println("* "+espacio+" *");
      }
      System.out.print(" ");
      for(int cont2 = 0; cont2<ancho; cont2++){ //PRINT DE LA BASE
          System.out.print(" *");
        }      
  }      
}
