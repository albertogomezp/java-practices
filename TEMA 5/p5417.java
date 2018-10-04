public class p5417 { 
  public static void main(String[] args){
    System.out.print("\n \n \n \n \n \n POR FAVOR, INSERTE EL NUMERO:  ");
    long num = Integer.parseInt(System.console().readLine()); 
    long sum = 0; //ALMACENA LA SUMA
    if(num<=0){
      System.out.println("EL NUMERO INTRODUCIDO NO ES VALIDO");
    } else{
      for (long cont = num; cont<(num+100); cont++){
          sum += cont;
        }
        System.out.println("LA SUMA TOTAL ES "+sum);
      } //DEBIDO A MI ESTILO DE CODIGO SIEMPRE EMPLEO INT CONT/CONT2/CONT3/... PARA USAR CONTADORES EN LOS BUCLES
  }
}
