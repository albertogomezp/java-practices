public class p5431 { 
  public static void main(String[] args){
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.print(" POR FAVOR, INSERTE UN LA ALTURA:  ");         //INTRODUCE EL NUMERO
    int alt = Integer.parseInt(System.console().readLine());
    for(int cont = 1; cont<(alt-1);cont++){
      System.out.println("*");
    }
    for(int cont2 = 0; cont2<((alt/2)+1); cont2++){
      System.out.print("* ");
    }
    
      
  }
}