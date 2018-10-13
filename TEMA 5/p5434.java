public class p5434 { 


  //----------------------INACABADO---------------------------------------------------



/* Escribe un programa que pida dos números por teclado y que luego mezcle en dos números diferentes los 
dígitos pares y los impares. Se van comprobando los dígitos de la siguiente manera: primer dígito del primer número,
primer dígito del segundo número, segundo dígito del primer número, segundo dígito del segundo número, tercer dígito
del primer número… Para facilitar el ejercicio, podemos suponer que el usuario introducirá dos números de la misma 
longitud y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de int donde sea necesario para
admitir números largos. */ 
  public static void main(String[] args){
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.println("REQUISITOS: \n -Deben introducirse dos numeros de la misma longitud \n -Que haya en cada al menos un numero par y otro impar");
    System.out.print(" POR FAVOR, INSERTE UN NUMERO:  ");        
    String uno = System.console().readLine();
    int num1 = Integer.parseInt(uno); 
    int divuno = 1;
    int unolongi =uno.length(); 
    System.out.print(" POR FAVOR, INSERTE OTRO NUMERO:  ");       
    String dos = System.console().readLine();
    int num2 = Integer.parseInt(dos); 
    int divdos = 1;
    int doslongi =dos.length();
    int print = 1;
    String longo = uno.concat(dos);
    int longi = longo.length();  
    int printmax = 1;

    for (int cont32 = 1; cont32 <=unolongi; cont32++){
      printmax = printmax*10;
    }
    
    
    //--------------------------------------------------- PARA LOS NUMEROS IMPARES----------------------
    for (int cont = 1 ; cont<=longi; cont++){ 
        for (int cont2 = 1; cont2<unolongi;  cont2++){ //va dividiendo hasta sacar el digito mas a la izquierda DEL UNO
          divuno = divuno*10;
        }
        print = (num1/divuno)%10;
        if(print%2 !=0 && print<10){                 //si el numero obtenido es IMPAR se imprime
          System.out.print(print);
        }
        unolongi--;
        divuno = 1;
        for (int cont3 = 1; cont3<doslongi;  cont3++){ //va dividiendo hasta sacar el digito mas a la izquierda DEL DOS
          divdos = divdos*10;
        }
        print = (num2/divdos)%10;
        if(print%2 !=0 && print<10){                 //si el numero obtenido es IMPAR se imprime
          System.out.print(print);
        }
        doslongi--;
        divdos = 1;    
    }
    //-------------------------------- RESET DE DATOS PARA LOS PARES ----------------------------
      System.out.println("");
    longi = longo.length();  
    divuno = 1;
    unolongi =uno.length();
    divdos = 1;
    doslongi =dos.length();  
    //------------------------------------ PARA LOS NUMEROS PARAES
    for (int cont = 1 ; cont<=longi; cont++){ 
      for (int cont2 = 1; cont2<unolongi;  cont2++){ //va dividiendo hasta sacar el digito mas a la izquierda DEL UNO
        divuno = divuno*10;
      }
      print = (num1/divuno)%10;
      if(print%2 ==0 && print<10){                  //si el numero obtenido es PAR se imprime
        while(print <printmax)
        {
          System.out.print(print);
        }  
      }
      unolongi--;
      divuno = 1;
      for (int cont3 = 1; cont3<doslongi;  cont3++){ //va dividiendo hasta sacar el digito mas a la izquierda DEL DOS
        divdos = divdos*10;
      }
      print = (num2/divdos)%10;
      if(print%2 ==0 && print<10){                 //si el numero obtenido es PAR se imprime
        while(print <printmax)
        {
          System.out.print(print);
        }  
      }
      doslongi--;
      divdos = 1;    
    }
  }      
}
