public class p5417 { 
  public static void main(String[] args){
    System.out.print("\n \n \n \n \n \n POR FAVOR, INSERTE EL NUMERO:  ");
    long num = Integer.parseInt(System.console().readLine());
    long sum = 0;
    if(num<=0){
      System.out.println("EL NUMERO INTRODUCIDO NO ES VALIDO");
    } else{
      for (long cont = num; cont<(num+100); cont++){
          sum += cont;
        }
        System.out.println("LA SUMA TOTAL ES "+sum);
      }
  }
}
