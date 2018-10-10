public class p5425 { 
  public static void main(String[] args){
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.print(" POR FAVOR, INSERTE UN NUMERO:  ");         //INTRODUCE EL NUMERO
    int num = Integer.parseInt(System.console().readLine()); 
    int longi = 0; //VARIABLE QUE NOS DARA LA LONGITUD DEL NUMERO
    int i = 10; //DIVISOR QUE IRA AVERIGUANDO NUMERO A NUMERO 
    int cont2 = 0; //CONTADOR PARA BUCLES
    int ant = 0;  //ALMACENA LOS DECIMALES AL IR DIVIDIENDO ENTRE 10 EL NUM
    //--------------------------ANALISIS DEL NUMERO--------------------------
    for (int cont = 1; cont<=num; cont=cont*10){ //BUCLE QUE OBTIENE LA LONGIUTD DEL NUMERO
      longi++;
    }
    //-----------------------------OPERACIONES--------------------------- 
    System.out.print("EL NUMERO AL REVES ES: "); //INICIO DEL PRINT
      for( cont2 = 1; cont2 <=(longi); cont2++){ //ESTE BUCLE IRA IMPRIMIENDO NUMERO A NUMERO
        ant =num%i; //CON ESTO LA VARIABLE ANT ALMACENARA EL NUMERO INTRODUCIDO CON EL ULTIMO DIGITO EN DECIMAL
        System.out.print(ant); //NOS IMPRIME EL 
        num = (num/10)-(ant/10);
      }
  }
} 