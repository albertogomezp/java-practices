public class p5416 { 
  public static void main(String[] args){
    System.out.print("\n \n \n \n \n \n POR FAVOR, INSERTE EL NUMERO:  ");
    int num = Integer.parseInt(System.console().readLine());
    boolean primo = true;
    int cont2 = 0; //contador que nos permitira saber si el numero es primo
    if(num<=2){
        primo = false;
    }
    for (int cont = 2; cont <=num; cont++){  //cont es para recorrer el bucle for
      if((num%cont) == 0){
        cont2++; //si es numero es disible entre el numero por el que vaya el contador (cont) se suma 1
      }
    }
    if(primo != false && (cont2<2)){
      System.out.println("EL NUMERO "+num+" ES PRIMO");
    } else{
      System.out.println("EL NUMERO "+num+" NO ES PRIMO");
    }



  }
}
