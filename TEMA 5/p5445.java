public class p5445{ 
  public static void main(String[] args){
    // ---------------- INTRODUCCION DE DATOS ------------
    System.out.print("INTRODUZCA UN NUMERO: ");
    String numero = System.console().readLine();
    int longi = numero.length();
    long num = Long.parseLong( numero );
    System.out.print("INTRODUZCA EL NUMERO QUE QUIERE INSERTAR: ");
    int num2 = Integer.parseInt(System.console().readLine());
    System.out.print("INTRODUZCA LA POSICION EN LA QUE QUIERE INSERTAR EL NUMERO: ");
    int div = Integer.parseInt(System.console().readLine());
    // ---------------- OPERACIONES ------------------
    if(div<=longi){ //PARA QUE NO INSERTEN UN NUMERO DIVISOR MAYOR QUE LA LONGITUD DEL NUMERO A DIVIDIR
      int divisor = 1;
      System.out.print("LOS NUMEROS PARTIDOS SON ");
      for (int cont2 = 1; cont2<=(longi-div)+1; cont2++){ //PARA HACER EL DIVISOR DEL TAMAÑO DEL NUMERO INSERTADO
        divisor=divisor*10;
      }
      System.out.println(num/divisor+""+num2+""+num%(divisor/10)); //LA DIVISION Y EL RESTO(modificado) DAN LOS NUMEROS ORIGINALES E INTRODUCE EL REQUERIDO
   } 
   else {
     System.out.println("ERROR");
   }
      
  }
}  