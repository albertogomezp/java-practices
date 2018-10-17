public class p5448 { 
  public static void main(String[] args){
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.print(" IDENTIFICADOR DE NUMEROS \n POR FAVOR, INSERTE UN NUMERO:  ");         //INTRODUCE EL NUMERO
    int num = Integer.parseInt(System.console().readLine()); 
    int longi = 0; //VARIABLE QUE NOS DARA LA LONGITUD DEL NUMERO
    int i = 10; //DIVISOR QUE IRA AVERIGUANDO NUMERO A NUMERO 
    int cont2 = 0; //CONTADOR PARA BUCLES
    int ant = 0;  //ALMACENA LOS DECIMALES AL IR DIVIDIENDO ENTRE 10 EL NUM
    boolean n1 = false;
    boolean n2 = false;
    boolean n3 = false;
    boolean n4 = false;
    boolean n5 = false;
    boolean n6 = false;
    boolean n7 = false;
    boolean n8 = false;
    boolean n9 = false;
    boolean n0 = false;
    //--------------------------ANALISIS DEL NUMERO--------------------------
    for (int cont = 1; cont<=num; cont=cont*10){ //BUCLE QUE OBTIENE LA LONGIUTD DEL NUMERO
      longi++;
    }
    //-----------------------------OPERACIONES--------------------------- 
    for( cont2 = 1; cont2 <=(longi); cont2++){ //ESTE BUCLE IRA IMPRIMIENDO NUMERO A NUMERO
      ant =num%i; //CON ESTO LA VARIABLE ANT ALMACENARA EL NUMERO INTRODUCIDO CON EL ULTIMO DIGITO EN DECIMAL
      switch (ant){
        case 1:
            n1 = true;
            break;
        case 2:
            n2 = true;
            break;    
        case 3:
            n3 = true;
            break; 
        case 4:
            n4 = true;
            break;
        case 5:
            n5 = true;
            break;    
        case 6:
            n6 = true;
            break; 
        case 7:
            n7 = true;
            break;
        case 8:
            n8 = true;
            break;    
        case 9:
            n9 = true;
            break; 
        default:
            n0 = true;
      }        
      num = (num/10)-(ant/10);
    }
    System.out.print(" RESULTADO: \n 1: "+n1+"\n 2: "+n2+"\n 3: "+n3+"\n 4: "+n4+"\n 5: "+n5+"\n 6: "+n6+"\n 7: "+n7+"\n 8: "+n8+"\n 9: "+n9+"\n 0: "+n0);
  }
} 