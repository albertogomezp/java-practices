public class p5429 { 
  public static void main(String[] args){
    System.out.print(" POR FAVOR, INSERTE UN NUMERO:  ");         //INTRODUCE EL NUMERO
    int num = Integer.parseInt(System.console().readLine()); //SE ALMACENA EL NUMERO
    System.out.print(" POR FAVOR, INSERTE DIVISOR:  ");         //INTRODUCE EL NUMERO
    int div = Integer.parseInt(System.console().readLine()); //SE ALMACENA EL NUMERO
    for(int cont = num; cont>0; cont--){
      if(cont%div != 0){
        System.out.println(cont);
      }
    }


  }
}