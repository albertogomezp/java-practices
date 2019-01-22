public class juegooca{
  public static void main(String[] args) {
    String[][] tablerobi = new String[8][7];
    int[][] subtablero = new int[8][7];
    int[] tableroli = new int[48];
    tablerobi = inicializartablero(tablerobi);
    
    
    
    
    
    
    
    
    
    
    
    
  }
  /**
  * Hace tirada de dado
  * @return casillas a avanzar
  */
  public static int tirardados(){
    int tirada =  (int)Math.random()+1*5;
    System.out.println("Avanza "+tirada+" casillas");
    return tirada;
  }
  /**
  * Inicializa los jugadores y los mete en un array
  * @return lista de jugadores.
  */
  public static String[] inicializarjugadores(){
    System.out.println("Introduce el numero de jugadores");
    int intr = Integer.parseInt(System.console().readLine());
    String[] jugadores = new String[intr];
    for(int x = 0; x <intr; x++ ){
      while(jugadores.length!=1){
        System.out.println("Introduzca caracter jugador "+(x+1));
        jugadores[x] = System.console().readLine();
      }
    }
    return jugadores;
  }
  /**
  * Crea el tablero con las casillas listas para ser ocupadas
  * @param tablero
  * @return
  */
  public static String[][] inicializartablero(String[][] tablero){
    int cont = 1;
    for(int x = 0; x <8; x++){
      for(int y = 0; y<7; y++){
        switch (cont){
          //casillas de oca
          case 4: case 8: case 10: case 14: case 20: case 30: case 36:
          case 40:case 42: case 46: case 52: 
          tablero[x][y]="xxx\n"+
                        "x  x\n"+
                        "xxx\n";
          
          break;
         
          //casilla de salida
          case 56: case 41: case 51: case 22:
          tablero[x][y]="xxx\n"+
                        "xSx\n"+
                        "xxx\n";
          break;
          //Esquina sup izq
          case 1: case 9: case 17:
          tablero[x][y]="xxx\n"+
                        "  x\n"+
                        "x x\n";
          break;
          //esquina inf izq
          case 7: case 13: case 19:
          tablero[x][y]="x x\n"+
                        "x  \n"+
                        "xxx\n";
          break;
          //esquna sup der
          case 50: case 44: case 48:
          tablero[x][y]="xxx\n"+
                        "  x\n"+
                        "x x\n";
          break;
          //esquna inf der 
          case 49: case 33:
          tablero[x][y]="x x\n"+
                        "  x\n"+
                        "xxx\n";
          break; 
          //verticales
          case 2: case 3:  case 5:
          case 11: case 6: case 39:
          case 55: case 54: case 53: 
          case 47: case 45:
          tablero[x][y]="x x\n"+
                        "x x\n"+
                        "x x\n";
          break;
          case 15:  case 21: case 23:
          case 27: case 28: case 29: case 34: 
          tablero[x][y]="xxx\n"+
                        "   \n"+
                        "xxx\n";
          break;
        } 
        System.out.print(tablero[x][y]);
        cont++;       
      }
      System.out.println("");
    }
    return tablero;
  }
  
}