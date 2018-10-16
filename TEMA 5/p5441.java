public class p5441 {  //HE CONSIDERADO 0 COMO NUMERO NO PAR Y NO IMPAR
  public static void main(String[] args){
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.print(" POR FAVOR, INSERTE UN NUMERO:  ");         //INTRODUCE EL NUMERO
    String numero =System.console().readLine();
    int num = Integer.parseInt(numero); 
    int longi = numero.length(); //VARIABLE QUE NOS DARA LA LONGITUD DEL NUMERO
    int i = 10; //DIVISOR QUE IRA AVERIGUANDO NUMERO A NUMERO 
    int cont2 = 0; //CONTADOR PARA BUCLES
    int ant = 0;  //ALMACENA LOS DECIMALES AL IR DIVIDIENDO ENTRE 10 EL NUM
    int impar = 0;
    int par = 0;
    //-----------------------------OPERACIONES--------------------------- 
    System.out.print("EL NUMERO AL REVES ES: "); //INICIO DEL PRINT
      for( cont2 = 1; cont2 <=(longi); cont2++){ //ESTE BUCLE IRA IMPRIMIENDO NUMERO A NUMERO
        ant =num%i; //CON ESTO LA VARIABLE ANT ALMACENARA EL NUMERO INTRODUCIDO CON EL ULTIMO DIGITO EN DECIMAL
        if(ant%2 ==0 && ant!=0){
          par++;
        } 
        else if(ant!=0){
          impar++;
        }
        num = (num/10)-(ant/10);
      }
      System.out.println("El numero "+numero+" tiene "+impar+" numeros impar(es) y "+par+" numeros par(es)");
  }
} 