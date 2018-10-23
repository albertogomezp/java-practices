 public class p631{ 
  public static void main(String[] args){
    System.out.println("Escribe un programa que muestre la tirada de tres dados. Se debe mostrar tambien la suma total (los puntos que suman entre los tres dados).");
    int DiceRoll = 0;
    int DiceAdd = 0;
    for(int dice =1; dice <=3; dice++){
      DiceRoll = (int)(Math.random()*6+1 );
      DiceAdd = DiceAdd + DiceRoll;
      System.out.println("La tirada del dado numero "+dice+" es: "+DiceRoll);
    }
    System.out.print("La suma de las tiradas es: "+DiceAdd);
  }
} 