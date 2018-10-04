public class p5422 { //Numeros primos 2->100 (variacion del p5416)
  public static void main(String[] args){
    int cont1 = 2; //variable que ira calculando los numeros
    int cont2; //variable que ira dividiendo a cont1 para saber si el cont1 es primo
    int cont3 = 0; //si el cont1 es primo, se emplea esto
    while( cont1 <= 100){ // Recorrido del while 2------>100   
      for ( cont2 = 1; cont2 <= cont1; cont2++){  
        if((cont1%cont2) == 0){
          cont3++; //si el cont1 es disible entre el numero por el que vaya el cont2
        }
      }
      if((cont3<=2)&&(cont1>2)){ //si hemos obtenido mas de 2 cont3, por tanto el numero no sera primo
        System.out.println("EL NUMERO "+cont1+" ES PRIMO");
      }
      cont1++; //para la siguiente vuelta
      cont3 = 0; //reset contador 
    }
  }
}