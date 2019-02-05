
/* Implementación de las torres de Hanoi haciendo uso de ArrayList de objetos Disco */
/* Lo ideal sería utilzar un Stack de objetos Disco ... */

public class TorresHanoiPOO {
  public static void main (String[] args) {
   
    TableroTorres postes;
    int cantidadDiscos;
    
  
    System.out.println("JUEGO DE LAS TORRES DE HANOI.");
   
    do {
      System.out.print("Introduzca la cantidad de discos con la que desea jugar (2-10): ");
      cantidadDiscos = Integer.parseInt(System.console().readLine());
      if ((cantidadDiscos<2) || (cantidadDiscos>10)) {
        System.out.println("Valor introducido fuera de rango. Tiene que volver a introducir la cantidad de discos.");
      }
    } while ((cantidadDiscos<2) || (cantidadDiscos>10));
  
    postes =  new TableroTorres(cantidadDiscos);
    postes.muestraTorres ();
    
    int posteOrigen;
    int posteDestino;
    boolean salir = false;
    
    do {
      do {
        System.out.print("Introduzca el nº de poste DESDE el que desea mover el disco (1-3): ");
        posteOrigen = Integer.parseInt(System.console().readLine());
        if (posteOrigen == -1) {
          salir = true;
        }
      } while ((posteOrigen<1 || posteOrigen>3) && !salir);
      if (!salir) {
        do {
          System.out.print("Introduzca el nº de poste HACIA el que desea mover el disco (1-3): ");
          posteDestino = Integer.parseInt(System.console().readLine());
          if (posteDestino == -1) {
            salir = true;
          }
        } while ((posteDestino<1 || posteDestino>3) && !salir);
        
        if (!salir) {
          if (posteOrigen == posteDestino) {
            System.out.println("Ha indicado postes iguales. Absurdo. Nada cambia.");
          } else if (postes.intentaMover (posteOrigen,posteDestino) == false) {
            System.out.println("No se puede realizar el movimiento indicado. Nada cambia.");
          }
          postes.muestraTorres ();      
        }
      }
      
    } while ((postes.checkHanoi() == false) && !salir);    
    
    if (postes.checkHanoi()) {
      System.out.println("HA FINALIZADO EL JUEGO CON ÉXITO !!");
    } else {
      System.out.println("Abandona.");
    }
    
    
  } 
  
  
}