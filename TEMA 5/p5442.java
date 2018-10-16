public class p5442 { 
  public static void main(String[] args){
    System.out.print("INTRODUZCA UN NUMERO ");
    int cont1 = Integer.parseInt(System.console().readLine());
    System.out.println("----------------------");
    int cont2; //variable que ira dividiendo a cont1 para saber si el cont1 es primo
    int cont3 = 0; //si el cont1 es primo, se emplea esto
    int cont4 = cont1+5;
    while( cont1 < cont4){ //
      for ( cont2 = 1; cont2 <= cont1; cont2++){  
        if((cont1%cont2) == 0){
          cont3++; //si el cont1 es divisible entre el numero por el que vaya el cont2
        }
      }
      if((cont3<=2)&&(cont1>2)){ //si hemos obtenido mas de 2 cont3, por tanto el numero no sera primo
        System.out.println("EL NUMERO "+cont1+" ES PRIMO");
      }
      else{
        System.out.println("EL NUMERO "+cont1+" NO ES PRIMO");
      }
      cont1++; //para la siguiente vuelta
      cont3 = 0; //reset contador 
    }
  }
}