public class Reloj{
  private static boolean imprime = false;
  public static void imprime(int alt){
    if(imprime){
      imprimeReloj(alt);
    }
    else{
      System.out.println("ERROR");
    }
  }


  /**
  * Imprime un reloj de arena a partir de su altura
  * @param alt
  */
  public static void imprimeReloj(int alt){
    for(int x  = 1; x<= alt; x++){
        for(int y = 1; y<=(alt-2); y++){

        }
    }  

  }
  












  /**
  * Revisa si el numero es valido
  * @param num
  */
  private static CheckNum(int num){
    if( (num%2 != 0) && (num>=3) ){
      imprime = true;
    }
  }
}