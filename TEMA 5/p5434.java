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
    System.out.print(" POR FAVOR, INSERTE OTRO NUMERO:  ");       
    String dos = System.console().readLine();
    int num2 = Integer.parseInt(dos); 
    String longo = uno.concat(dos);
    int longi = long.length();
    for (cont = 1 ; cont<longi; cont+){




    }






  }      
}
