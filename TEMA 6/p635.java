/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
 Muestra también el máximo, el mínimo y la media de esos números.*/
public class p635{ 
  public static void main(String[] args){
    int print = 0;
    int maximo = 0;
    int minimo = 999;
    int suma = 0;
    int cont2 = 0;
   for(int cont = 1; cont<=50; cont++){
     print =(int)((Math.random()*99)+100);
     minimo = Math.min(minimo, print);
     maximo = Math.max(maximo, print);
     suma = suma+print;
     cont2++;
     System.out.print(print+" ");
   } 
    System.out.print("\n Maximo "+maximo+"\n Minimo "+minimo+" \n media "+(suma/cont2));
  }
} 