public class p5432 { 
  public static void main(String[] args){
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.print(" POR FAVOR, INSERTE UN NUMERO ENTERO POSITIVO:  ");         //INTRODUCE EL NUMERO
    String str = System.console().readLine();
    long num = Integer.parseInt(str);

    long add = 0; //ESTO CALCULARA LA SUMA DE TODOS LOS NUMEROS PARES
    int suma = 1; //ESTO SIRVE PARA CALCULAR LOS NUMEROS PARES, LO ALMACENA EN UN UNICO NUMERO, HAY QUE ARREGLAR ESTO
    long sumacont =0; //SUMACONT NOS SIRVE PARA GUARDAR LOS NUMEROS
    long ant = 0; //NOS GUARDA LOS POSIBLES NUMEROS PARES
    int longi = str.length();  
    if(num>0){
      for(int cont2 = 1; cont2 <=(longi); cont2++){ //ESTE BUCLE OBTIENE LOS NUMEROS PARES
        ant =num%10; //CON ESTO LA VARIABLE ANT ALMACENARA EL NUMERO INTRODUCIDO CON EL ULTIMO DIGITO EN DECIMAL
        num = (num/10)-(ant/10); //CON ESTO HAREMOS QUE LA UNIDAD SEA EL SIGUIENTE NUMERO A ANALIZAR
        if(ant%2 ==0){ //SI EL NUMERO QUE ESTAMOS ANALIZANDO ES PAR...
          sumacont=sumacont+(ant*suma); //LA SUMA DE LOS NUMEROS PARES SERA SI MISMA + EL NUMERO OBTENIDO COLOCADO EN DECENA/CENTENA...
          suma = suma*10; //GUARDARA LA SIGUIENTE CIFRA EN DECENA/CENTENA...
          add =add+ant; //LA SUMA DE TODOS LOS NUMEROS
        }
      }
      System.out.println("LOS NUMEROS PARES SON: " +sumacont+" Y SU SUMA ES: "+add);
    }
    else{
      System.out.println("ERROR");
    }
  }
}