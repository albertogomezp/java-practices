public class p6317{ 
  public static void main(String[] args){
    System.out.print("POR FAVOR, INTRODUZCA LA ALUTRA (minimo 4) ");
    int y = Integer.parseInt(System.console().readLine());
    System.out.print("POR FAVOR, INTRODUZCA LA ANCHURA (minimo 4) ");
    int x = Integer.parseInt(System.console().readLine());
    int adjust=0;
    //consideraremos el 0 como 1, al igual que en un array 
    //we will consider 0 as 1, similar to an array
    // position_x
    adjust = x-2;
    int positionx = (int)(Math.random()*adjust);
    // position_y
    adjust = y-2;
    int positiony = (int)(Math.random()*adjust);
    // print parte superior 
    // print upper arrow
    for (int printx = 1; printx <= x; printx++){
      System.out.print("* ");
    }
    System.out.print("\n");
    // print del cuerpo de la pecera 
    for (int printy = 0; printy <(y-2); printy++){
      System.out.print("* "); //imprime la columna de la izquierda
      for (int hueco = 0; hueco <(x-2);hueco++ ){ //bucle que recorre las posiciones horizontales
        if( printy == positiony && hueco == positionx ){ //en el caso que la coordenada coincida con la del pez
          System.out.print("& "); //imprime el pez
        }
        else{
          System.out.print("  "); //no imprime el pez
        }
      }
      System.out.println("*"); //print de la columna de la derecha
    }
    for (int printx = 1; printx <= x; printx++){ //print de la parte inferior
      System.out.print("* ");
    }
  }
}