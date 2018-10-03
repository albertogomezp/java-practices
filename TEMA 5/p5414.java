public class p5414 { //Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
  public static void main(String[] args){
    System.out.print("POR FAVOR, INSERTE LA BASE:  ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("POR FAVOR, INSERTE LA POTENCIA: ");
    int potencia = Integer.parseInt(System.console().readLine());
    System.out.println("------------------------------");
    int basecont = base; //El ANS de una calculadora, que va almancenando las potenicas
    for (int cont = potencia; cont > 0; cont--){
      basecont = basecont*base; //Va multiplicando el resultado de (base*base)*base
      /* POR EJEMPLO:  BASE = 2; POTENCIA 5
      2*2 = 4 / 4*2 = 8 / 8*2 = 16 / 16*2 = 32 / 32*2 = 64 */
      System.out.println(basecont);
      }
  }
}
