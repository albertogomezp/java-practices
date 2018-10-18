/* Una empresa de cartelería nos ha encargado un programa para realizar uno de sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña durante el 2018,
 han recibido muchos pedidos del cartel que muestra el número 155. Realiza un programa que pinte el número 155 mediante asteriscos. Al usuario se le pedirán dos datos, la 
 altura del cartel y el número de espacios que habrá entre los números. La altura mínima es 5. La anchura de los números siempre es la misma. La parte superior de los cincos 
 también es siempre igual. La parte inferior del 5 sí que varía en función de la altura. */
 public class p5450 {  
  public static void main(String[] args){
    //-------------------------- 
    System.out.print(" POR FAVOR, INSERTE LA ALTURA:  ");        
    String altString = System.console().readLine();
    int alt = Integer.parseInt(altString); 
    System.out.print(" POR FAVOR, INSERTE EL ESPACIADO:  ");        
    String espString = System.console().readLine();
    int esp = Integer.parseInt(espString);
    String distance ="";
    //-------------------------- 
    for (int row = 1; row <=alt; row++){  // ira imprimiendo fila por fila
      for (int FirstSpace = 1; FirstSpace <= esp; FirstSpace++){//calcula la separacion entre entre el 1 y el primer 5 y el segundo 5  ( 1 <    > 5 )
        distance = distance.concat(" ");
      }
      if ( row == 1 || row == 3 || row == alt ){
        System.out.println("*"+distance+"****"+distance+"****");  
      } else  if (row == 2){
          System.out.println("*"+distance+"*   "+distance+"*   ");
        } else{
              System.out.println("*"+distance+"   *"+distance+"   *");
            }
      distance ="";
    }
  }      
}
