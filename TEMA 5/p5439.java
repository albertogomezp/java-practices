public class p5439 { 
  public static void main(String[] args){
    System.out.print(" POR FAVOR, INSERTE UN NUMERO (al que quiere calcular el factorial):  ");         //INTRODUCE EL NUMERO
    long num = Long.parseLong(System.console().readLine()); //SE ALMACENA EL NUMERO
    long ans= 1;
    for (int cont = 1 ; cont <=num ; cont++){
      ans=cont*ans;
      System.out.println(cont+"! = "+ans);
    }
  }
}