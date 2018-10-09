public class p5428 { 
  public static void main(String[] args){
    System.out.print(" POR FAVOR, INSERTE UN NUMERO (al que quiere calcular el factorial):  ");         //INTRODUCE EL NUMERO
    int num = Integer.parseInt(System.console().readLine()); //SE ALMACENA EL NUMERO
    int ans= 1;
    for (int cont = 1 ; cont <=num ; cont++){
      ans=cont*ans;
      System.out.println(ans);
    }
  }
}