 public class ejercicio3{ 
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
        if(cont == 1 || cont == altura){          //--------------------------------> PRINT DE LA TAPA SUPERIOR E INFERIOR 
          for (int cont3a = 1; cont3a <=altura; cont3a++){ //BUCLE QUE IMPRIME EL RELLENO
            System.out.print("*");
          }
          System.out.println(" ");
        }
        else{           //----------------------------------------------------------> PRINT DEL RELLENO
          System.out.print("*");
          for (int cont3b = 1; cont3b <=altura-2; cont3b++){ //BUCLE QUE IMPRIME EL RELLENO
            System.out.print(" ");
          }
          System.out.println("*");
        }
        espacios--; //AJUSTE PARA REDUCIR EL ESPACIADO
      
      }









    }
    else{
      System.out.println("ERROR #0: el valor int 'altura' NO es valido.");
    }
  }
} 