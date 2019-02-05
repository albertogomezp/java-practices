/**
* Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
* ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
* números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
* y 20 elementos ambos inclusive.
*
* @author Alberto Gómez Peña
*/
import java.util.ArrayList;
public class Gestor{  
  public static void main(String[] args) {
    ArrayList<Integer> Valores = new ArrayList<Integer>();
    int min = 10;
    int max = 20;
    int limite = (int)(Math.random() * (max - min) + min);
    min = 0;
    max = 100;
    for(int x = 0; x <limite; x++){
      Valores.add((int)(Math.random() * (max - min) + min));
    }
    int cont = 1;
    for(int valor : Valores){
      System.out.println("Valor #"+cont+": "+valor);
      cont++;
    }
    
  }
}