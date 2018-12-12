/*
[2 puntos] Escriba un programa que solicite al usuario números enteros comprendidos entre los valores 1 y 100,
y que genere un histograma con las frecuencias de cada número entero introducido. Si el valor introducido
está fuera del rango [1,100], se informará al usuario que el valor no es válido y será ignorado, volviéndosele a
solicitar un nuevo valor, salvo en el caso del valor -1, que servirá para finalizar la captura de enteros. Para
representar las barras del histograma utilice secuencias del carácter ‘*’. Por ejemplo, la secuencia: 1, 1, 20, 1,
2, 20, 3, 3, 3, 4, 4, 4, 33, 3, -1 generaría la siguiente salida: */
import java.util.Scanner;
/*
* Ejercicio 3 del examen de programación del día 12/12/2018
*
* @author Alberto Gómez Peña
*/
public class ejercicio4{ 
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] ar = new int[100];
    int cont = 0;
    int num = 1;
    while(num !=-1){
      System.out.print("Introduzca un numero del 1 al 100: ");
      num = scanner.nextInt();
      if(num>0){
        ar[cont] = num;
        System.out.println("ar["+cont+"] "+ar[cont]);
        cont++;
      }
    }
    for(int x = 1; x<=100; x++){
      System.out.print(x+":");
      for(int y = 0; y<ar.length;y++){
        if(ar[y]==x){
          
          System.out.print("*");
        }    
      }
      System.out.println("");
    }
    
  }  
}
