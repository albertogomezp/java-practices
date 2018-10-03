public class p5415 { 
  public static void main(String[] args){
    System.out.print("POR FAVOR, INSERTE LA BASE:  ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("POR FAVOR, INSERTE LA POTENCIA: ");
    int potencia = Integer.parseInt(System.console().readLine());
    System.out.println("------------------------------");
    int basecont = 1; //El ANS de una calculadora, que va almancenando las potenicas
    for (int cont = 1; cont <=potencia; cont++){
      
      basecont = basecont*base; 
      System.out.println(base+"^"+cont+" :"+basecont);
      }
  }
}
