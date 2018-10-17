// Hacer un programa que nos muestre los números del 0-0-0 al 9-9-9, sustituyendo cada dígito "3" por la letra "E"
public class ejercicio { 
  public static void main(String[] args){
    int cont1 = 0;
    int cont2 = 0;
    int cont3 = 0; 
    String uno ="";
    String dos ="";
    String tres ="";
    for ( cont1 = 0; cont1 <= 9 ; cont1++){
      if(cont1==3){
        uno = "E";
      }
      else{
        uno =Integer.toString(cont1);
      }
      for ( cont2 = 0 ; cont2 <=9 ; cont2++){
        if(cont2==3){
          dos = "E";
        }
        else{
          dos =Integer.toString(cont2);
        }
        for ( cont3 = 0 ; cont3 <=9; cont3++){
          if(cont3==3){
            tres = "E";
          }
          else{
            tres =Integer.toString(cont3);
          }
          System.out.print(uno+"-"+dos+"-"+tres+"      ");
        }
        System.out.println("");
      }
    } 
  }      
}
