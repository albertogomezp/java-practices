 public class ejercicio2{ 
      //Ejercicio realizado por ALBERTO GOMEZ del curso 1DAW del IES Campanillas para el examen de programacion del dia 23/10/2018
  public static void main(String[] args){
    //---------------------------- INTRODUCCION DE DATOS -------------
    System.out.print(" POR FAVOR, INSERTE LA ALTURA  ");       
    String AlturaString = System.console().readLine();
    int altura = Integer.parseInt(AlturaString);
    int espacios = altura-1;    
    //---------------------- OPERACIONES -----------------
    if(4<=altura && altura <=20){  //COMPROBADOR DE LA ALTURA INTRODUCIDA
      for (int cont = 1; cont <= altura; cont++){ //BUCLE QUE IMPRIME CADA FILA
        for (int cont2 = 1; cont2<=espacios; cont2++){ // BUCLE QUE IMPRIME LOS ESPACIOS
          System.out.print(" ");
        }
        for (int cont3 = 1; cont3 <=altura; cont3++){ //BUCLE QUE IMPRIME EL RELLENO
          System.out.print("*");
        }
        System.out.println(" ");
        espacios--; //AJUSTE PARA REDUCIR EL ESPACIADO
      }
    }
    else{
      System.out.println("ERROR #0: el valor int 'altura' NO es valido.");
    }
  }
} 