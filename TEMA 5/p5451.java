/* El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que encuentre). Realiza un programa que muestre un número antes y después
 de haber sido comido por el gusano. Si el animalito no se ha comido ningún dígito, el programa debe indicarlo. */
 public class p5451{ 
  public static void main(String[] args){
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.print(" POR FAVOR, INSERTE UN NUMERO:  ");         //INTRODUCE EL NUMERO
    String numero = System.console().readLine();
    String NumeroIni = numero;
    int num = Integer.parseInt(numero); 
    int num2 = num;
    int longi = numero.length(); //VARIABLE QUE NOS DARA LA LONGITUD DEL NUMERO
    int i = 10; //DIVISOR QUE IRA AVERIGUANDO NUMERO A NUMERO 
    int ant = 0;  //ALMACENA LOS DECIMALES AL IR DIVIDIENDO ENTRE 10 EL NUM
    String resultado ="";
    String IntString ="";

    //-----------------------------OPERACIONES--------------------------- 

    for(int cont2 = 1; cont2 <=(longi); cont2++){ //ESTE BUCLE IRA CONCATENANDO NUMERO A NUMERO AL REVES
      ant =num2%i; //CON ESTO LA VARIABLE ANT ALMACENARA EL NUMERO INTRODUCIDO CON EL ULTIMO DIGITO EN DECIMAL
      IntString = Integer.toString(ant);
      resultado = resultado.concat(IntString);
      num2 = (num2/10)-(ant/10);
    }
        num2 = Integer.parseInt(resultado);
    resultado ="";
    for(int cont2 = 1; cont2 <=(longi); cont2++){ //ESTE BUCLE IRA CONCATENANADO NUMERO A NUMERO AL DERECHO
      ant =num2%i; //CON ESTO LA VARIABLE ANT ALMACENARA EL NUMERO INTRODUCIDO CON EL ULTIMO DIGITO EN DECIMAL
      if(( ant != 0 )&&( ant != 8)){ // EN CASO DE QUE SEA 0 U 8
        IntString = Integer.toString(ant);
        resultado = resultado.concat(IntString);
      }  
        num2 = (num2/10)-(ant/10);
    }
    boolean comp = NumeroIni.equals(resultado);
    if(comp == true){
      System.out.println("EL GUSANO NO SE HA COMIDO NINGUN NUMERO");
    } 
    else{
      System.out.println("LOS NUMEROS DESPUES DE QUE EL GUSANO HAYA COMIDO 0s 8 8s: "+resultado); 
    }
    
  }
} 