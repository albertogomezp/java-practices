public class p5437 {
  public static void main(String[] args) {
    //--------------------       INTRODUCCION DEL NUMERO   --------------------
    System.out.println("CONVERSOR DECIMAL A SISTEMA PALITO");
    System.out.print("INTRODUZCA EL NUMERO ENTERO POSITIVO DECIMAL ");
    String numero = System.console().readLine();
    int num = Integer.parseInt(numero);
    int longi = numero.length();
    int longi2 = longi;
    int divi = 1;
    int print = 0;
    for (int cont = 0; cont <= longi;  cont++){
      for (int cont2 = 1; cont2 <= longi2; cont2++){
        divi = divi*10;
      }
      longi2--;
      print = -(num/divi)%10;
      print=Math.abs(print);
      divi = 1;
      for (int cont3 =1; cont3 <=print; cont3++){
        System.out.print("|");
      }
      if(cont >0  && cont <longi){
       System.out.print("-");
      }
      
    }
  }
}