  /*
  *  minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
  *
  *
  * @author Alberto Gómez Peña
  */
  import funciones.arrays;
  import java.util.Scanner;

import conversores.funciones;

  public class p8621{ 
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
     System.out.println("Please, introduce the size of the array");
      int ArSize = scanner.nextInt();
      System.out.println("Please, introduce the minimun number");
      int MinNum = scanner.nextInt();
      System.out.println("Please, introduce the maximun number");
      int MaxNum = scanner.nextInt();
      int[] Ar = arrays.generaArrayInt(ArSize, MinNum, MaxNum);
      arrays.PrintArray(Ar); 
      System.out.println("\nMinimun Number:"+arrays.minimoArrayInt(Ar));
    }
  }
  