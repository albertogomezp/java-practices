public class p5418 { 
  public static void main(String[] args){
    System.out.print("\n \n \n \n \n \n POR FAVOR, INSERTE EL PRIMER NUMERO:  ");
    int num1 = Integer.parseInt(System.console().readLine()); 
    System.out.print(" POR FAVOR, INSERTE EL SEGUNDO NUMERO:  ");
    int num2 = Integer.parseInt(System.console().readLine()); 
    if(num1==num2){ //si ambos son iguales
      System.out.println(" ES EL MISMO NUMERO");
    }
    if(num1>num2){ //si el primer numero es mayor que el segundo
      for(int cont=num2; cont<=num1; cont=cont+7){
        System.out.println(cont);
      }
    }
    if(num1<num2){ //si el segundo numero es mayor que el primero
      for(int cont=num1; cont<=num2; cont=cont+7){
        System.out.println(cont);
      }
    }





  }
}
