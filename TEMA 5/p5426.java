public class p5426 { 
  public static void main(String[] args){
    //Este ejercicio parte del ejercicio anterior, pues a raiz del mismo con una pequenya modificiacion (el if) se saca este programa.
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.print(" POR FAVOR, INSERTE UN NUMERO:  ");         //INTRODUCE EL NUMERO
    int num = Integer.parseInt(System.console().readLine()); 
    System.out.print(" POR FAVOR, INSERTE UN DiGiTO:  ");         //INTRODUCE EL NUMERO
    int dig = Integer.parseInt(System.console().readLine()); 
    int longi = 0; //VARIABLE QUE NOS DARA LA LONGITUD DEL NUMERO
    int i = 10; //DIVISOR QUE IRA AVERIGUANDO NUMERO A NUMERO 
    int cont2 = 0; //CONTADOR PARA BUCLES
    int ant = 0;  //ALMACENA LOS DECIMALES AL IR DIVIDIENDO ENTRE 10 EL NUM
    //--------------------------ANALISIS DEL NUMERO--------------------------
    for (int cont = 1; cont<=num; cont=cont*10){ //BUCLE QUE OBTIENE LA LONGIUTD DEL NUMERO
      longi++;
    }
    int cont3 = longi; //CONT3 = LONGI, POR TANTO, NOS SERVIRA PARA IR IMPRIMIENDO LAS POSICIONES DE LAS COINCIDENCIAS
    System.out.println("------------------------------------------------------");
    //-----------------------------OPERACIONES--------------------------- 
      for( cont2 = 1; cont2 <=(longi); cont2++){ //ESTE BUCLE IRA IMPRIMIENDO NUMERO A NUMERO
        ant =num%i; //CON ESTO LA VARIABLE ANT ALMACENARA EL NUMERO INTRODUCIDO CON EL ULTIMO DIGITO EN DECIMAL
        if (ant==dig){ //SI SE CUMPLE, SIGNIFICA QUE EN ESA POSICION TENEMOS EL DIGITO DESEADO
          System.out.print("EL NUMERO "+dig+" ESTA EN LA POSICION "+cont3+"\n"); //PRINT QUE NOS INDICARA EN QUE POSICION SE ENCUENTRA DIG
        } 
        num = (num/10)-(ant/10);
        cont3--; //CON CADA VUELTA, DISMINUYE EN 1, POR TANTO, LA PRIMERA COMRPOBACION ES EL ULTIMO DIGITO Y ASI SUCESIVAMENTE
      }

  }
}