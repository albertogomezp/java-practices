/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y almacenados en 
 * un objeto de la clase ArrayList.
 * 
 * @author Alberto Gómez Peña 1º -DAW
 */
import java.util.Collections;
import java.util.ArrayList;
public class Gestor{
  public static void main(String[] args) {
    ArrayList<Integer> Numeros = new ArrayList<Integer>();
    imprimeln("Vamos a ordenar 10 numeros introducidos por teclado");
    for(int x = 0; x<10; x++){
      imprimeln("Introduzca un entero");
      Numeros.add(Integer.parseInt(System.console().readLine()));
    }
    Collections.sort(Numeros);
    int cont = 1;
    for(int x : Numeros){
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