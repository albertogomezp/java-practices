import java.util.Scanner;
import paquetes.funciones;
/*
* Ejercicio 3 del examen de programación del día 12/12/2018
*
* @author Alberto Gómez Peña
*/
public class ejercicio3{ 
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduzca el tope (al menos, 6): ");
    int tope = scanner.nextInt();
    int divis = 0;
    long sumador = 0;
    int[] divisores = new int[tope];
    for(long cont = 6; cont <=tope;cont++){
      sumador = funciones.ObtenerDivisoresYsuma(cont,sumador,divis,tope);
      sumador = funciones.comprobarYreset(sumador,cont);
    }

  }  
}
