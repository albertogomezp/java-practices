public class p5427 { 
  public static void main(String[] args){
    System.out.print(" POR FAVOR, INSERTE UN NUMERO:  ");         //INTRODUCE EL NUMERO
    int num = Integer.parseInt(System.console().readLine()); //SE ALMACENA EL NUMERO
    int cont2 = 1; //CONTADOR QUE IRA CALCULANDO LOS MULTIPLOS DE 3
    for (int cont = 1; cont<=(num/3); cont++){ //AL SER TODOS MULTIPLOS DE 3, EL CONTADOR1 SERA IGUAL AL 1/3 DE NUM CUNADO CONT2=NUM
      System.out.println(cont2*3); //PRINT
      cont2++; //AUMENTA EN 1 EL CONT2 
    }
  }
}