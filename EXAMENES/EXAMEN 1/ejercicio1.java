 public class ejercicio1{ 
      //Ejercicio realizado por ALBERTO GOMEZ del curso 1DAW del IES Campanillas para el examen de programacion del dia 23/10/2018
  public static void main(String[] args){
    //---------------------------- INTRODUCCION DE DATOS -------------
    System.out.print(" POR FAVOR, INSERTE UN NUMERO ENTERO  ");       
    String NumeroString = System.console().readLine();
    int NumeroDecimal = Integer.parseInt(NumeroString);
    int AcuDec = NumeroDecimal;
    int Resto = 0;
    long NumeroBinario = 2; //---------> El 2 NO sera parte del numero binario
    while (AcuDec > 0){
      Resto = AcuDec%2;
      AcuDec = AcuDec/2;
      if (Resto == 0){
        NumeroBinario = NumeroBinario*10;
      }
      else{
        NumeroBinario = (NumeroBinario*10)+1;
      }
    }
    //----------------- METODO PARA VOLTEAR EL NUMEOR Y QUITAR EL 2
    long NumeroBinario2 = NumeroBinario;
    String StringBinario = Long.toString(NumeroBinario2);
    int LongitudBinario  = StringBinario.length();
    long almacen = 0;  //ALMACENA LOS DECIMALES AL IR DIVIDIENDO ENTRE 10
    for(int cont2 = 1; cont2 <=(LongitudBinario); cont2++){ //print de la solucion
      almacen =NumeroBinario2%10; //Guarda datos
      if(almacen != 2){ //para ignorar el 2 previamente introducido
        System.out.print(almacen); //Print
      }
      NumeroBinario2 = (NumeroBinario2/10)-(almacen/10); //ajuste para quitar decimales
    }
  }
} 