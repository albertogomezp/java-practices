public class p5443{  //------------------------- INACABADO ---------------------------------
  public static void main(String[] args){
    // ---------------- INTRODUCCION DE DATOS ------------
    System.out.print("INTRODUZCA UN NUMERO: ");
    String numero = System.console().readLine();
    int longi = numero.length();
    int num = Integer.parseInt( numero );
    System.out.print("INTRODUZCA LA POSICION POR LA QUE QUIERE PARTIR EL NUMERO: ");
    int div = Integer.parseInt(System.console().readLine());
    // ---------------- OPERACIONES ------------------
    if(div<=longi){ //PARA QUE NO INSERTEN UN NUMERO DIVISOR MAYOR QUE LA LONGITUD DEL NUMERO A DIVIDIR
      int divisor = 1;
      System.out.print("LOS NUMEROS PARTIDOS SON ");
      for (int cont2 = 1; cont2<=(longi-div)+1; cont2++){ //PARA HACER EL DIVISOR DEL TAMAÑO DEL NUMERO INSERTADO
        divisor=divisor*10;
      }
      System.out.println(num/divisor+" Y "+num%divisor); //LA DIVISION Y EL RESTO
   } 
   else {
     System.out.println("ERROR");
   }
      
  }
}  