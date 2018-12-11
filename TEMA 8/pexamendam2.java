/*
* Pintar un árbol de navidad dada la altura del mismo, se considera la estrella y el tronco, ambos de altura 1
*
* @author Alberto Gómez Peña
*/
import java.util.Scanner;
import examendam.funciones;;
public class pexamendam2{ 
  public static void main(String[] args) {
    /**
    *  Si la altura introducida es 7, realmente estamos trabajando con una pirámide hueca de 5
    *  en la punta superior tiene una * y en la base, en la mitad, un #
    *  para height = 4, tendremos una altura de 2, por lo que seran 4 #, tres abajo y una arriba,
    *  como no tengo ganas de pensar, hago un bucle que me calcule el ancho máximo de la pirámide
    */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, introduce the height");
    int height = scanner.nextInt();
    int ancho = funciones.CalcAncho(height);

    System.out.println(ancho);
    /**
    *  
    *  Con esto ya tenemos el ancho máximo, por lo que podemos decir que el sitio donde se pone la estrella,
    *  el prumer # y el tronquito será (ancho+1)/2, también será nuestro punto de partida para pintar #s 
    *  Luego lo pasaremos a una función molona
    */
    int centro = (ancho+1)/2;
    String huecosarriba = "";
    for(int cont = 1; cont < centro; cont++){
      if(cont !=centro){
        huecosarriba = huecosarriba.concat(" ");
      }
    }
    String[] arbol = new String[height];
    arbol[0]=huecosarriba.concat("*");
    arbol[1]=huecosarriba.concat("#");
    arbol[height-1]=arbol[1];
    String anchointerno = "";
    String anchoexterno = "";
    for(int cont = 2;  cont <=height-2; cont++){
      if(cont == 2){
        anchointerno = anchointerno.concat(" ");        
      }
      else{
        anchointerno = anchointerno.concat("  ");
      }
      for(int cont3 = 1; cont3 < ((ancho-anchointerno.length())/2); cont3++){
        anchoexterno = anchoexterno.concat(" ");
      }
      arbol[cont]= anchoexterno+"#"+anchointerno+"#";
      anchoexterno = "";
      //anchointerno = "";
    }
    String base = "";
    for(int x = 0; x <ancho; x++){
      base = base.concat("#");
    }
    arbol[height-2]=base;
    funciones.PrintArray(arbol);
  }
}
