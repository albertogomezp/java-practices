import org.w3c.dom.css.Counter;

/* Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que 
se muestra a continuación. Muestra el contenido de todos los elementos del array. 
¿Qué sucede con los valores de los elementos que no han sido inicializados? */ 
public class p741{ 
  public static void main(String[] args){
    int [] ar = new int [11];
    ar[0] = 39;
    ar[1] = -2;
    ar[4] = 0;
    ar[6] = 14;
    ar[8] = 5;
    ar[9] = 120;
    for(int Counter = 0; Counter<= ar.length-1; Counter++){
      System.out.println("ar["+Counter+"] = "+ar[Counter]);
    }
  }
}