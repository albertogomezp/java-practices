/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 * 
 * @author Alberto Gómez Peña 1º -DAW
 */
import java.util.Collections;
import java.util.ArrayList;
public class Gestor{
  public static void main(String[] args) {
    ArrayList<String> Palabras = new ArrayList<String>();
    imprimeln("Vamos a ordenar 10 palabras introducidas por teclado");
    for(int x = 0; x<10; x++){
      imprimeln("Introduzca una palabra");
      Palabras.add(System.console().readLine());
    }
    Collections.sort(Palabras);
    int cont = 1;
    for(String x : Palabras){
      System.out.println("Valor Ordenado #"+cont+": "+x);
      cont++;
    }

  }
  /**
   * Soy vagoo
   * @param imprime el string 
   */
  public static void imprimeln(String imprime){
    System.out.println(imprime);
  }
}